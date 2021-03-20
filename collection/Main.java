package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Collection collection;

// --------------------------------LIST--------------------------------//

        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // using ArrayList
        List<String> planets = new ArrayList<>();

        // method add() untuk menambahkan objek ke List
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
        // for others object  masih bisa terus ditambahkan ke List

        System.out.println("List planets awal:");
        // method size() untuk mendapatkan ukuran List

        for (int i = 0; i < planets.size(); i++) {
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        // method remove() untuk mengeluarkan objek dari List
        planets.remove("venus");

        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }

}
