package com.example.compilers;

public class Scanner {

    private byte[] input;
    private int current; 

	public Scanner (byte[] input) {
        this.input = input;
    }

    private char peek () {
        if (current < input.length)
           return (char)input[current];
       return '\0';
    }

}
