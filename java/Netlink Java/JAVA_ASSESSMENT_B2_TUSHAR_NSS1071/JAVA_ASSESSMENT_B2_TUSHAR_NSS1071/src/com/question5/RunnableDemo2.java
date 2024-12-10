package com.question5;

public class RunnableDemo2 {

    public static void main(String[] args) {
        Runnable rth = () -> Thread.currentThread();

        Thread th = new Thread(rth);

        th.setName("Runnable Demo 2");

        System.out.println("Thread Name: "+th.getName()+" "+"Thread Priority: "+th.getPriority());
    }

}
