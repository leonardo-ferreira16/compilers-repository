package com.example.compilers;

import com.example.compilers.enumss.TokenType;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "45  + preco - 876";
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
        System.out.println(tk);
    }

    }
}