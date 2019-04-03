package com.rta2;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;

import java.io.IOException;

public class RTA2 {

    public static void main(String[] args) throws IOException{

        try (PDDocument document = PDDocument.load(new File("C:\\Users\\Liang\\rta2\\A182 Draft Stud.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                PDFTextStripper tStripper = new PDFTextStripper();
                stripper.setSortByPosition(true);
                String pdfFileInText = tStripper.getText(document);

                String lines[] = pdfFileInText.split("\\r?\\n"); 

          
        Thread t1 = new Thread(new CalcTotal(lines),"Thread 1: - Calculate total course :");
         t1.start();

         try{
            t1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
            

        Thread t2 = new Thread(new Day(),"Thread 2: - Total days for exam is :");
        t2.start();
        
        try{
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
            

        Thread t4 = new Thread(new CalcSoc(lines),"Thread 4: - Total courses for SOC is :");
        t4.start();

        try{
            t4.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread t3 = new Thread(new ListSoc(lines),"Thread 3: - List of SOC courses :");
        t3.start();

        try{
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread t5 = new Thread(new STIW3054(lines),"Thread 5: - RealTime :");
        t5.start();

        }

    }
}

}