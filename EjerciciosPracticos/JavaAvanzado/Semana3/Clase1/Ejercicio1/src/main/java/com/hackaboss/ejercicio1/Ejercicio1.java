package com.hackaboss.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
      Directory root = new Directory("root");
      Directory folder1 = new Directory("Folder1");
      Directory folder2 = new Directory("Folder2");
      Directory folder1A = new Directory("Folder1A");
      Directory folder1B = new Directory("Folder1B");
      folder1A.addFile("File1Aa");
      folder1A.addFile("File1Ab");
      folder1B.addFile("File1Ba");
      folder2.addFile("File2a");
      
      root.addSubdirectory(folder1);
      root.addSubdirectory(folder2);
      folder1.addSubdirectory(folder1A);
      folder1.addSubdirectory(folder1B);
      
      DirectoryExplorer.exploreDirectory(root, 0);
    }
}
