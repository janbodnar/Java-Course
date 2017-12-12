package com.zetcode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFilesWrite {

    public static void main(String[] args) {
        
        String fileName = "/home/janbodnar/tmp/myfile.txt";
        Path myPath = Paths.get(fileName);

        Charset charset = Charset.forName("UTF-8");
        String str = "Today is a beautiful day\n";
        
        try (BufferedWriter writer = Files.newBufferedWriter(myPath, charset)) {
            writer.write(str, 0, str.length());
            
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
