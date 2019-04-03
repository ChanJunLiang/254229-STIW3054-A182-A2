package com.rta2;

public class ListSoc implements Runnable {

    String lines[];

    public ListSoc(String lines[]) {
        this.lines = lines;
    }

    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("*****************************************************************");

        for (String lines : lines) {

            if (lines.contains("STIW") || lines.contains("STIJ") || lines.contains("STIX") || lines.contains("STID")
                    || lines.contains("STIK1") || lines.contains("STIK2") || lines.contains("STIK3")
                    || lines.contains("STIA") || lines.contains("STIN") || lines.contains("STQM")
                    || lines.contains("STQS")) {

                System.out.println(Thread.currentThread().getName() + " " + lines);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                

            }
        }

        System.out.println("*****************************************************************");
    
    }
}
