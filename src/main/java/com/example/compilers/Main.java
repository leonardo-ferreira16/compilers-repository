package com.example.compilers;

import com.example.compilers.enumss.TokenType;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "45  + preco - 876";
        Parser p = new Parser (input.getBytes());
        p.parse();

    }
}