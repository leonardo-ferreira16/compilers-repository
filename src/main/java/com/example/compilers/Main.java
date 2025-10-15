package com.example.compilers;

import com.example.compilers.enumss.TokenType;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "let a = 42 + 5;";
        Parser p = new Parser (input.getBytes());
        p.parse();

    }
}