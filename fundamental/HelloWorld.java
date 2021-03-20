package com.week1.intro;
import java.util.Scanner; // import library to accept input
import com.week1.try1.try1; // import package

public class HelloWorld {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n ///-----Hello Wold!-----///\n"); // As Always Intro
        System.out.print(" There are have three choices:\n");
        System.out.println(" \t1.Input Student Data \n\t2.Example of Gymnosperm \n\t" +
                             "3.Example of Carnivorous \n\t4.Timer a Minute");
        System.out.print(" Please choose one: ");
        int Choices; Choices = input.nextInt();

        switch (Choices) {
            case 1:
                System.out.println("\n -------------------------");
                introduction.studentData(); // Calling Introduction class to HelloWorld class
                System.out.println("\n -------------------------");
                break;
            case 2:
                System.out.println("\n -------------------------");
                try1.Plant(); // Calling Try1 class to Plant class
                System.out.println("\n -------------------------");
                break;
            case 3:
                System.out.println("\n -------------------------");
                try1.Animal(); // Calling Try1 class to Animal class
                System.out.println("\n-------------------------");
                break;
            case 4:
                System.out.println("\n -------------------------");
                try1.TimerManual(); // Calling Try1 class to TimerMinute class
                System.out.println("\n -------------------------");
                break;
            default:
                break;
        }
    }
}
