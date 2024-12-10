package com.question7;

public class Main {

    public static void main(String[] args) {
        int square = 0;
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for(i=0;i<=arr.length;i++){
            square = square + (i*i);
        }
        System.out.println(square);
        if(square>=100 && arr.length>=10){
            throw new MyException("Range overflow");
        }

    }

}
