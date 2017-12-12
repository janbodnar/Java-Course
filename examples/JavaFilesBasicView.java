package com.zetcode;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaFilesBasicView {

    public static void main(String[] args) throws IOException {

        Path path = FileSystems.getDefault().getPath("/home/janbodnar/ball.png");

        BasicFileAttributeView view = Files.getFileAttributeView(path,
                BasicFileAttributeView.class);
        BasicFileAttributes attrs = view.readAttributes();

        System.out.println("Creation time: " + attrs.creationTime());
        System.out.println("Last Accessed time: " + attrs.lastAccessTime());
        System.out.println("Last Modified time: " + attrs.lastModifiedTime());
        System.out.println("File key: " + attrs.fileKey());
        System.out.println("Directory: " + attrs.isDirectory());
        System.out.println("Other Type of file: " + attrs.isOther());
        System.out.println("Regular file: " + attrs.isRegularFile());
        System.out.println("Symbolic file: " + attrs.isSymbolicLink());
        System.out.printf("Size: %d bytes%n", attrs.size());
    }
}
