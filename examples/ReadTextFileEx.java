package com.zetcode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadTextFileEx {

    public static void main(String[] args) throws IOException {

        String fileName = "src/resources/thermopylae.txt";

        List<String> lines = Files.readAllLines(Paths.get(fileName), 
                StandardCharsets.UTF_8);

        StringBuilder sb = new StringBuilder();

        for (String line : lines) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}
