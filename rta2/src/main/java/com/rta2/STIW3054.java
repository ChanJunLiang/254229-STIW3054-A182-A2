package com.rta2;

public class STIW3054 implements Runnable{

    String lines[];

    public STIW3054 (String lines[]){
        this.lines = lines;
    }

    public void run(){
        for(String lines : lines){
            if(lines.contains("STIW3054")){

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println("*****************************************************************");
                System.out.println(Thread.currentThread().getName() + " " +lines);
                System.out.println("*****************************************************************");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
}