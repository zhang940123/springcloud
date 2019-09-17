package com.example.consumers.streamdemo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {
    private List<String> words;

    //流遍历demo
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\c\\projects\\springcloud\\consumers\\src\\main\\java\\com\\example\\consumers\\filepackage\\alice.txt", new String[]{})), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split(","));
        long count = 0;
        for (String w : words) {
            if(w.length()>3){
                count++;
            }
        }
        System.out.println("asdaaada");
        System.out.println(count);
        System.out.println(words.stream().filter(w->w.length()>5).count());
    }
}
