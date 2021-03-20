package com.diana.javafundamental;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args){

        Scanner ngescan = new Scanner(System.in);
        System.out.println("Program pengurangan: ");

        System.out.print("Enter First Number: ");
        int value = ngescan.nextInt();//memanggil data dari input

        System.out.print("Enter Secand Number: ");
        int anothervalue = ngescan.nextInt();

        int hasil = value - anothervalue;
        System.out.println("Hasilnya adalah  "+hasil);

        //untuk "string" = Scanner.next()
        //Jika data yang diinputkan "Integer" = Scanner.nextInt()

        //BufferedReader tidak dapat berjalan sendiri.
        // Untuk mendapatkan input dibutuhkan kelas InputStreamReader.

        String name = "Annisa Nurdiana";
        int length = name.length();
        System.out.println(length);
        char ambilU = name.charAt(8);
        //Mengambil karakter dari string dengan
        //Method charAt(int index)
        System.out.println("Hasilnya adalah  "+ambilU);
    }

}
