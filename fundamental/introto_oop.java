package com.week1;
import java.util.Scanner;

public class introto_oop {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String name; int age;
        System.out.println("\n------------------------------------");
        System.out.print("Name\t: ");
        name = in.nextLine();
        System.out.print("Age \t: ");age = in.nextInt();
        System.out.println("\nThe result is:\nHello "+name+", you are "+age+" years       old.\n");
        System.out.format("NAME : %s", name.toUpperCase());
        System.out.format("\tAGE  : %d", age);
        //%s to string %d to int %f to float
        System.out.println("\n------------------------------------\n");
    }
}
