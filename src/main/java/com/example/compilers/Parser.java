package com.example.compilers;

import com.example.compilers.enumss.TokenType;

public class Parser {

    private Scanner scan;
    private Token currentToken;

    public Parser(byte[] input) {
        scan = new Scanner(input);
        currentToken = scan.nextToken();
    } 

    public void parse () {
        expr();
    }

    private void nextToken () {
        currentToken = scan.nextToken();
    }

    private void match(TokenType t) {
        if (currentToken.type == t) {
            nextToken();
        } else {
            throw new Error("syntax error");
        }
    }

    void number () {
        System.out.println("push " + currentToken.lexeme);
        match(TokenType.NUMBER);
    }

    void oper () {
        if (currentToken == '+') {
            match('+');
            digit();
            System.out.println("add");
            oper();
        } else if (currentToken == '-') {
            match('-');
            digit();
            System.out.println("sub");
            oper();
        }
    }

    void expr() {
        digit();
        oper();
    }



}
