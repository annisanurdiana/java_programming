package com.week5;

import java.util.Scanner;


public class test {

    // Fizz = multiple 3
    // Buzz = multiple 5
    // FizzBuzz = Multiple 3 and 5

    public static void main(String[]args){
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter Number: \n"); int i = in.nextInt();

        int num = 0;
        while (num <= 100){
            if (num % 15 == 0){
               String A = "FizzBuzz" ;
                System.out.println(A);
            }
            else if (num % 5 == 0){
                String B = "Buzz";
                System.out.println(B) ;
            }
            else if (num % 3 == 0){
                String C = "Fizz";
                System.out.println(C);
            }
            num = num + 1;
        }

        //---Prime Number---//

        for(int Num = 0; Num < 100; Num++)
        {
            if (Num > 1 ) {
                System.out.println(Num+" Prime Number");
            }
            else {
                System.out.println(Num+" This is not Prime Number");
            }
        }


    }
}
