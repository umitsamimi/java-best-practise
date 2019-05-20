package com.tr.umitsamimi.advice.tryfinally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    // try-finally - No longer the best way to close resources! (page 34)
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
            //throw new IOException("file is not readable");
        } finally {
            br.close();
            //throw new IOException("file is not closable");
        }
    }

    public static void main(String[] args) throws IOException {
        String path = "/Zeytinburnu/SumerMah";
        System.out.println(firstLineOfFile(path));
    }
}
