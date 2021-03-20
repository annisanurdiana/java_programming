package com.week1.intro;
import java.io.BufferedReader;
import java.io.IOException; // error handling
import java.io.InputStreamReader;
import java.util.Scanner; // import library to accept input

public class introduction {
    public static void studentData(){
        Scanner input = new Scanner(System.in);

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader((streamReader));
        /* BufferedReader which is assisted by InputStreamReader
        so that it can read Input from the Keyboard. */

        String name; int age; int nim;
        System.out.print(" Enter Your Name: "); name = input.nextLine();
        System.out.print(" Enter Your Age: "); age = input.nextInt();

        double grade = 0;
        try{
            System.out.print(" Enter Your GPA: ");
            grade = Double.parseDouble(bufferedReader.readLine());
        }
        // ioException as an input error handling in the BufferedReader
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.print(" Enter Your Student ID: "); nim = input.nextInt();
        System.out.println("\n>>>The Result is: \n\t Hello "+name.toUpperCase()+", " +
                "you are "+age+" years old.\n\t (NIM: "+nim+") Your GPA is "+grade);

        // System.out.format("Name: %s\age: %d\n grade: %.2f\n", name, age, grade);
        // Why the code above has an error?
    }
}
