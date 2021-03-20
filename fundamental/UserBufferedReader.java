package com.diana.javafundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
   public static void main(String[] args){
       InputStreamReader streamReader = new InputStreamReader(System.in);
       BufferedReader bufferedReader = new BufferedReader((streamReader));
       // BufferedReader yang dibantu oleh InputStreamReader
       // agar dapat membaca Input dari Keyboard.
       System.out.println("Math Basic Program");

       int nilai = 0;
       int nilaiLain = 0;
       try{
           System.out.print("Enter first number: ");
           nilai = Integer.parseInt(bufferedReader.readLine());
           System.out.print("Enter second number: ");
           nilaiLain = Integer.parseInt(bufferedReader.readLine());
       }
       // ioException sebagai penanganan error input
       // pada BufferedReader
       catch (IOException e){
           e.printStackTrace();
       }
       int hasil = nilai - nilaiLain;
       System.out.println("The result is "+hasil);


   }

}
