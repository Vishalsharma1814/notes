package com.question3;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    static ArrayList<Integer> prime_num = new ArrayList<>();

    public static void get_data(){
        prime_num.add(7);
        prime_num.add(11);
        prime_num.add(3);
        prime_num.add(13);
        prime_num.add(5);
        prime_num.add(2);
    }

    public static void main(String[] args) {
        Main.get_data();

        System.out.println("List of prime numbers before sorting...................");
        System.out.println(prime_num);

        System.out.println("List of prime numbers after sorting.......................");
        Collections.sort(prime_num);
        System.out.println(prime_num);
    }




}
