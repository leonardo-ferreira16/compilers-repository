package com.example.compilers;

public class Parser {
    private byte[] input;
    private int current; 

	public Parser (byte[] input) {
        this.input = input;
    }

    public void parse () {
        // aqui ainda ira o código
    }

    private char peek () {
        if (current < input.length)
           return (char)input[current];
        return '\0';
    }

}
