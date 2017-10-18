package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateDirectoryEx {

    public static void main(String[] args) throws IOException {
        
        Files.createDirectories(Paths.get("/home/janbodnar/tmp/newdir"));

    }
}
