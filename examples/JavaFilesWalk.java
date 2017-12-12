package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// recursive walking

public class JavaFilesWalk {

    public static void main(String[] args) throws IOException {

        try (Stream<Path> paths = Files.walk(Paths.get("/home/janbodnar/prog"))) {
            paths.forEach(System.out::println);
        }
    }
}
