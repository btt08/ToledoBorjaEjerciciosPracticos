package com.hackaboss.ejercicio1;

public class DirectoryExplorer {

  public static void exploreDirectory(Directory dir, int level) {
    String identation = " ";
    for (int i = 0; i < level; i++) {
      identation += "  ";
    }

    System.out.println(identation + dir.getName());
    
    for (String fileName : dir.getFiles()) {
      System.out.println(identation + "|-" + fileName);
    }

    for (Directory subdirectory : dir.getSubdirectories()) {
      exploreDirectory(subdirectory, level + 1);
    }
  }
}
