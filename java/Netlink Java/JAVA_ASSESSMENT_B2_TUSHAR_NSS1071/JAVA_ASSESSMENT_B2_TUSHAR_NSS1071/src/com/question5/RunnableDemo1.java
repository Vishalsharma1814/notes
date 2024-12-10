package com.question5;

public class RunnableDemo1{

    public static void main(String[] args) {
        Runnable rth = () -> Thread.currentThread();

        Thread th = new Thread(rth);

        th.setName("Runnable Demo 1");

        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(2000);
                System.out.println("Thread Name: " + th.getName() + " " + "Thread Priority: " + th.getPriority());
            }
        }
        catch (InterruptedException ie){
            System.out.println("Interrupted Exception !!");
        }
    }

}

