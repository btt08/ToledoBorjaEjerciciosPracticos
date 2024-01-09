package com.hackaboss.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
  private String name;
  private List<Directory> subdirectories;
  private List<String> files;

  public Directory() {
  }
  
  public Directory(String name) {
    this.name = name;
    this.subdirectories = new ArrayList<>();
    this.files = new ArrayList<>();
  }
  
  public Directory(String name, List<Directory> subdirectories, List<String> files) {
    this.name = name;
    this.subdirectories = subdirectories;
    this.files = files;
  }

  public void addSubdirectory(Directory dir){
    this.subdirectories.add(dir);
  }
  
  public void addFile(String file){
    this.files.add(file);
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Directory> getSubdirectories() {
    return subdirectories;
  }

  public void setSubdirectories(List<Directory> subdirectories) {
    this.subdirectories = subdirectories;
  }

  public List<String> getFiles() {
    return files;
  }

  public void setFiles(List<String> files) {
    this.files = files;
  }

  @Override
  public String toString() {
    return "Directory{" + "name=" + name + ", subdirectories=" + subdirectories + ", files=" + files + '}';
  }  
}
