package com.zetcode;

import java.io.IOException;
import org.jsoup.Jsoup;

public class ReadWebPageEx {

    public static void main(String[] args) throws IOException {

        String webPage = "http://www.something.com";
        
        String html = Jsoup.connect(webPage).get().html();
        
        System.out.println(html);
    }
}
