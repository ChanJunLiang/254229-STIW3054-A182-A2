package com.rta2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Day implements Runnable {

    public Day() {

    }

    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDate start = LocalDate.of(2019, Month.MAY, 25);

        LocalDate end = LocalDate.of(2019, Month.JUNE, 21);

        long day = (ChronoUnit.DAYS.between(start, end)) - 9;

        System.out.println("*****************************************************************");
        System.out.println(Thread.currentThread().getName() + " " +day);
        System.out.println("*****************************************************************");


    }

}