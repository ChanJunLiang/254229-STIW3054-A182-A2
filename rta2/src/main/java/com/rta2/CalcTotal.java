package com.rta2;

public class CalcTotal implements Runnable{

    String lines[];
    int count = 0;

    public CalcTotal(String lines[]){
        this.lines = lines;
    }

    public void run(){
        for(String lines : lines){
            if(lines.contains(":")){
                count++;
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("*****************************************************************");
        System.out.println(Thread.currentThread().getName() + " " +count);
        System.out.println("*****************************************************************");

    }
}