package com.question6;

public class Swap {

    public static void main(String[] args) {
        int a = 50;
        int b = 50;

        System.out.println("Before swapping : ");
        System.out.println("a: "+a+" "+"b: "+b);

        // Logic
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: ");
        System.out.println("a: "+a+" "+"b: "+b);

    }
}
