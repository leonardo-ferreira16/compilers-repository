package com.example.compilers;


public class Main {
    public static void main(String[] args) throws Exception {
        String input = "4-8+6";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());

    }
}