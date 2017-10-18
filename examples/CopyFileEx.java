package com.zetcode;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileEx {

    public static void main(String[] args) throws IOException {

        Path fromPath = Paths.get("/home/janbodnar/tmp/myfile.txt");
        Path toPath = Paths.get("/home/janbodnar/tmp/myfile2.txt");
        
        CopyOption[] options = new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };
        
        Files.copy(fromPath, toPath, options);

    }
}
