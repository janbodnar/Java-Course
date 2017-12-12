package com.zetcode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFilesAttributes {

    public static void main(String[] args) {

        String fileName = "/home/janbodnar/ball.png";
        Path myPath = Paths.get(fileName);

        if (Files.isExecutable(myPath)) {

            System.out.println("The file is executable");
        } else {

            System.out.println("The file is not executable");
        }

        if (Files.isReadable(myPath)) {

            System.out.println("The file is readable");
        } else {

            System.out.println("The file is not readable");
        }

        if (Files.isWritable(myPath)) {

            System.out.println("The file is writable");
        } else {

            System.out.println("The file is not writable");
        }
    }
}
