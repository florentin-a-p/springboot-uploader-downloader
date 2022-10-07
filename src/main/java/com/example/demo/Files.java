package com.example.demo;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filesTable")
@NoArgsConstructor
@EqualsAndHashCode
public class Files {
  @Id
  @Column(name="id")
  private int id;

  @Column(name="fileGroup")
  private String fileGroup;

  @Column(name="fileName")
  private String fileName;

  @Column(name="file")
  private String file;

  public Files(int id, String fileGroup, String fileName, String file) {
    this.id = id;
    this.fileGroup = fileGroup;
    this.fileName = fileName;
    this.file = file;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFileGroup() {
    return fileGroup;
  }

  public void setFileGroup(String fileGroup) {
    this.fileGroup = fileGroup;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }
}
