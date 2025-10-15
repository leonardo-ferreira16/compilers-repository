package com.example.compilers;

//import com.example.compilers.enumss.TokenType;

public class Main {
    public static void main(String[] args) throws Exception {
        /* 
        String input = """
                push 10
                push 20
                add
                pop a
                push 45
                push a
                sub
                print    
                """;
        */

        String input = """
            let a = 42 + 2;
            let b = 15 + 3;
            print a + b;        
                """;
        
        Parser p = new Parser (input.getBytes());
        p.parse();

        System.out.println(p.output());

        Interpretador i = new Interpretador (p.output());
        i.run();
    }
}