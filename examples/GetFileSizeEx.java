package com.zetcode;

import java.io.File;

public class GetFileSizeEx {

    public static void main(String[] args) {

        File file = new File("/home/janbodnar/tmp/myfile.txt");
        System.out.println(file.length());

    }
}
