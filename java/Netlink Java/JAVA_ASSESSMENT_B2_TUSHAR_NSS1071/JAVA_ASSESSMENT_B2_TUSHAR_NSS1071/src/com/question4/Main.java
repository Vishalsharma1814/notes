package com.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<String> data = new ArrayList<>(Collections.nCopies(100, "mkyong"));
    public static void main(String[] args) throws ListTooLargeException {

        if(data.size()>50){
           throw new ListTooLargeException("List is too large !!");
        }



    }
}
