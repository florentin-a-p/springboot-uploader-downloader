package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilesController {
  @Autowired(required = false)
  FilesService filesService;

  @PostMapping(path="/uploader")
  public ResponseEntity<Files> uploadFiles(@RequestParam(value="fileGroup") String fileGroup, @RequestParam(value="files") String files) {
    try {
      ResponseEntity<Files> response = new ResponseEntity<>(filesService.uploadFiles(),HttpStatus.CREATED);
      return response;
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping(path="/downloader")
  public ResponseEntity<Files> downloadFiles(@RequestParam(value="fileGroup") String fileGroup) {
    try {
      ResponseEntity<Files> response = new ResponseEntity<>(filesService.downloadFiles(fileGroup),HttpStatus.OK);
      return response;
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
