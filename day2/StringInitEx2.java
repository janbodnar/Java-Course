package com.zetcode;

import java.nio.charset.Charset;

public class StringInitEx2 {

    public static void main(String[] args) {
        
        char[] cdb = {'M', 'y', 'S', 'q', 'l'};

        String lang = "Java";
        String ide = new String("NetBeans");
        String db = new String(cdb);

        System.out.println(lang);
        System.out.println(ide);
        System.out.println(db);
        
        StringBuilder sb1 = new StringBuilder(lang);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fields");
        sb2.append(" of ");
        sb2.append("glory");
        
        System.out.println(sb1);
        System.out.println(sb2);
        
        byte[] bytes = new byte[] { 74, 85, 91, 97, 102, 121 }; 
        String str = new String(bytes,  Charset.forName("utf-8"));
        System.out.println(str);
    }
}
