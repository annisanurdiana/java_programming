package com.midterm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/*

Name        : ANNISA NURDIANA
Class       : INFORMATION TECHNOLOGY - 4 / 2020
Student ID  : 001202000067

>>>PROBLEM,
    "Create a Program to Handle All Cases of Triangular Shapes - Geometry Advanced Program"

>>>DISPLAY,
    ===================== TRIANGULAR ADVANCED CALCULATION  ====================
    1. Triangle Shape 2D
    2. Triangle Shape 3D
    Please choose one according to the numbers above. Enter Number: <input int>

    ***

    Here is a selection from number 1 - Shape 2D:
    1. Equilateral Triangle
    2. Isosceles Triangle
    3. Right Angled Triangle
    What do you want to calculate? choose one: <input int>

    ***

    Here is a selection from number 2 - Shape 3D:
    1. Pyramid
    2. Triangular pyramid (Tetrahedron).
    3. Triangular prism.
    What do you want to calculate? choose one: <input int>


>>>PROGRAM,
    1. Display the triangular calculation statement
    2. Displays a command to select a statement
    2. Receive user input according to the input command
    4. Runs and displays the output according to what the user has selected
    5. Displays the second part specific geometry calculation options
    6. The program will starts according to the input
    7. The results of the input are displayed

>>>SOLUTION,
    ...

*/


public class IT001202000067 {
    public static void main(String[]args){

        // ---InputStreamReader so that it can read Input from the Keyboard---
        InputStreamReader streamReader = new InputStreamReader(System.in);
        // ---BufferedReader which is assisted by InputStreamReader---
        BufferedReader write = new BufferedReader((streamReader));

        // ---Exception Handle---
        try {
            System.out.print("\n===================== TRIANGULAR ADVANCED CALCULATION  ====================\n");
            Collection<String> Chooses = new ArrayList<>();
            Chooses.add("1. Triangle Shape 2D");
            Chooses.add("2. Triangle Shape 3D");
            for (var choose:Chooses){
                System.out.println(choose);
            }
            System.out.print("Please choose one according to the numbers above. Enter Number: ");
            int value = Integer.parseInt(write.readLine());

            // Collection list to choose the Shape
            Collection<String> Choose_Calc = new ArrayList<>();

            switch (value) {
                case 1:
                    // Create a Scanner object
                    Scanner input = new Scanner(System.in);

                    // ---Calculate_Triangle_Shape_2D--
                    System.out.println("\nHere is a selection from number 1 - Shape 2D:");
                    Collection<String> Choose2D = new ArrayList<>();
                    Choose2D.add("1. Equilateral Triangle");
                    Choose2D.add("2. Isosceles Triangle");
                    Choose2D.add("3. Right Angled Triangle");
                    for (var choose2D:Choose2D){
                        System.out.println(choose2D);
                    }
                    System.out.print("What do you want to calculate? choose one: ");
                    int choose = input.nextInt();

                    // List to choose calculate the 2D Shape
                    Choose_Calc.add("1. Calculate the perimeter");
                    Choose_Calc.add("2. Calculate Area");

                    if (choose == 1){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);

                        // ---.Equilateral Triangle.---
                        System.out.println("\nHere is a selection from '1':");
                        for (var choose1:Choose_Calc){
                            System.out.println(choose1);
                        }
                        System.out.print("What do you want to calculate? choose one: ");
                        int choose2 = in.nextInt();

                        if (choose2 == 1){
                            // --.Find the perimeter of Equilateral Triangle.--
                            System.out.print("\nEnter Side length of Equilateral Triangle: ");
                            double side_length = Double.parseDouble(write.readLine());

                            equilateral Equilateral = new equilateral(0,0);
                            Equilateral.setSide(side_length);
                            Equilateral.perimeter();
                        }

                        else if (choose2 == 2){
                            // --.Find the area of Equilateral Triangle.--
                            System.out.print("\nEnter Height of Equilateral Triangle: ");
                            double Height_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Base of Equilateral Triangle: ");
                            double Base_1 = Double.parseDouble(write.readLine());

                            equilateral Equilateral2 = new equilateral(Base_1,Height_1);
                            Equilateral2.area();
                        }
                    }

                    else if (choose == 2){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);
                        // ---.Isosceles_Triangle.---
                        System.out.println("\nHere is a selection from '2':");
                        for (var choose_2:Choose_Calc){
                            System.out.println(choose_2);
                        }
                        System.out.print("What do you want to calculate? choose one: ");
                        int choose2 = in.nextInt();

                        if (choose2 == 1){
                            // ---Calculate the Perimeter---
                            System.out.print("\nEnter side of base of Isosceles Triangle  ");
                            double num_side1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter one of the hypotenuse of the Isosceles Triangle  ");
                            double num_side2 = Double.parseDouble(write.readLine());

                            isosceles Isosceles = new isosceles(0,0);
                            Isosceles.setSide_1(num_side1);Isosceles.setSide_2(num_side2);
                            Isosceles.perimeter();

                        }
                        else if (choose2 == 2 ){
                            // ---Calculate the Area---
                            System.out.print("\nEnter Height of Isosceles Triangle: ");
                            double Height_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Base of Isosceles Triangle: ");
                            double Base_1 = Double.parseDouble(write.readLine());

                            isosceles Isosceles2 = new isosceles(Height_1,Base_1);
                            Isosceles2.area();
                        }
                    }
                    else if (choose == 3){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);
                        // ---.Right_Angled_Triangle.---
                        System.out.println("\nHere is a selection from 3:");
                        for (var choose_3:Choose_Calc){
                            System.out.println(choose_3);
                        }
                        Choose_Calc.add("3. Calculate Hypotenuse");
                        System.out.print("What do you want to calculate? choose one: ");
                        int choose2 = in.nextInt();

                        if (choose2 == 1){
                            // ---Calculate the perimeter---
                            System.out.print("\nEnter Height of Right_Angled Triangle: ");
                            double Height_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Base of Right_Angled Triangle: ");
                            double Base_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Hypotenuse of Right_Angled Triangle: ");
                            double Hypotenuse_1 = Double.parseDouble(write.readLine());

                            right_angled Right_Angled = new right_angled(Base_1,Height_1);
                            Right_Angled.setHypotenuse(Hypotenuse_1);
                            Right_Angled.perimeter();
                        }
                        else if(choose2 == 2){
                            // ---Calculate the Area---
                            System.out.print("\nEnter Height of Isosceles Triangle: ");
                            double Height_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Base of Isosceles Triangle: ");
                            double Base_1 = Double.parseDouble(write.readLine());

                            right_angled Right_Angled_2 = new right_angled(Base_1,Height_1);
                            Right_Angled_2.area();
                        }
                        else if(choose2 == 3){
                            // ---Calculate the Hypotenuse of right_angled Triangle---
                            System.out.print("\nEnter Height of Right_Angled Triangle: ");
                            double Height_1 = Double.parseDouble(write.readLine());
                            System.out.print("Enter Base of Right_Angled Triangle: ");
                            double Base_1 = Double.parseDouble(write.readLine());

                            right_angled Right_Angled = new right_angled(Base_1,Height_1);
                            Right_Angled.Hypotenuse();
                        }
                    }
                    break;

                case 2:
                    // Create a Scanner object
                    Scanner input_ = new Scanner(System.in);
                    // ---Calculate_Triangle_Shape_3D--
                    System.out.println("\nHere is a selection from number 2 - Shape 3D:");
                    Collection<String> Choose_ = new ArrayList<>();
                    Choose_.add("1. Pyramid");
                    Choose_.add("2. Triangular pyramid (Tetrahedron).");
                    Choose_.add("3. Triangular prism.");
                    for (var choose3D:Choose_){
                        System.out.println(choose3D);
                    }
                    System.out.print("What do you want to calculate? choose one: ");
                    int choose_2 = input_.nextInt();

                    // List to choose calculate the 3D Shape
                    Choose_Calc.add("1. Calculate the perimeter");
                    Choose_Calc.add("2. Calculate Area");

                    if (choose_2 == 1){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);

                        // ---Shape-3D Pyramid
                        System.out.println("\nHere is a selection from '1' :");
                        Choose_Calc.addAll(Arrays.asList("3. Find Side Diagonals","4. Find Space Diagonals","5. Calculate the Volume"));
                        for (var choose3D:Choose_Calc){
                            System.out.println(choose3D);
                        }
                        System.out.print("What do you want to calculate? choose one: ");
                        int chooseValue = in.nextInt();

                        isosceles Isosceles_;

                        if (chooseValue == 1){
                            // ---Calculate the perimeter of Pyramid---
                            System.out.print("\nPlease enter the value of of the base of Triangular Pyramid: ");
                            double base_triangle = Double.parseDouble(write.readLine());
                            System.out.print("Please enter the value of of the frame of Triangular Pyramid: ");
                            double frame_py = Double.parseDouble(write.readLine());

                            Isosceles_ = new t_pyramid(0,0);
                            t_pyramid T_Pyramid = new t_pyramid(base_triangle,0);
                            T_Pyramid.setFrame(frame_py);
                            Isosceles_.perimeter();
                        }
                        else if (chooseValue == 2){
                            // ---Calculate the area of Pyramid---
                            System.out.print("\nPlease enter the value of the base of Triangular Pyramid: ");
                            double base_py = Double.parseDouble(write.readLine());
                            System.out.print("Please enter the area of Triangular Pyramid: ");
                            double area_py = Double.parseDouble(write.readLine());

                            Isosceles_ = new t_pyramid(0,0);
                            t_pyramid T_Pyramid = new t_pyramid(base_py,0);
                            T_Pyramid.setAreaTriangle(area_py);
                            Isosceles_.area();

                        }
                        else if (chooseValue == 3){
                            // ---Find the Side Diagonals---
                            System.out.print("\nPlease enter the value of the base of Triangular Pyramid: ");
                            double base_py = Double.parseDouble(write.readLine());

                            t_pyramid T_Pyramid = new t_pyramid(base_py,0);
                            T_Pyramid.side_diagonal();
                        }
                        else if (chooseValue == 4){
                            // ---Find the Space Diagonals---
                            System.out.print("\nPlease enter the value of the base of Triangular Pyramid: ");
                            double base_py = Double.parseDouble(write.readLine());

                            t_pyramid T_Pyramid = new t_pyramid(base_py,0);
                            T_Pyramid.perpendicular_diagonal();
                        }
                        else if (chooseValue == 5){
                            // ---Calculate the volume of the Pyramid---
                            System.out.print("\nPlease enter the value of the base of Triangular Pyramid: ");
                            double base_py = Double.parseDouble(write.readLine());
                            System.out.print("\nPlease enter the value of the height of Triangular Pyramid: ");
                            double height_py = Double.parseDouble(write.readLine());

                            t_pyramid T_Pyramid = new t_pyramid(base_py,0);
                            T_Pyramid.setHeight(height_py);
                            T_Pyramid.volume();
                        }
                        else{
                            System.out.println("\n ===INVALID===");
                        }
                    }

                    else if (choose_2 == 2){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);

                        // ---Shape 3D >> Triangular pyramid (Tetrahedron)
                        System.out.println("\nHere is a selection from '2' :");
                        Choose_Calc.add("3. Calculate the Volume");
                        for (var choose1:Choose_Calc){
                            System.out.println(choose1);
                        }
                        System.out.print("What do you want to calculate? choose one: ");
                        int value_Shape3D = in.nextInt();
                        equilateral Equilateral_;

                        switch (value_Shape3D){
                            case 1:
                                // ---Calculate the perimeter of Triangular pyramid (Tetrahedron)---
                                System.out.print("\nEnter Height of the surface of Tetrahedron: ");
                                double Height = Double.parseDouble(write.readLine());
                                System.out.print("Enter Base of the surface of Tetrahedron: ");
                                double Base = Double.parseDouble(write.readLine());

                                Equilateral_ = new tetrahedron(Height,Base);
                                Equilateral_.perimeter();
                                break;

                            case 2:
                                // ---Calculate Area of Triangular pyramid (Tetrahedron)---
                                System.out.print("\nEnter Base of the surface of Tetrahedron: ");
                                double Base2 = Double.parseDouble(write.readLine());
                                System.out.print("Enter Height of the surface of Tetrahedron: ");
                                double Height2 = Double.parseDouble(write.readLine());

                                Equilateral_ = new tetrahedron(Height2,Base2);
                                Equilateral_.area();
                                break;

                            case 3:
                                // ---Calculate the Volume of Triangular pyramid (Tetrahedron)---
                                System.out.print("\nEnter Base of the surface of Tetrahedron: ");
                                double Base3 = Double.parseDouble(write.readLine());
                                System.out.print("Enter Height of the surface of Tetrahedron: ");
                                double Height3 = Double.parseDouble(write.readLine());
                                System.out.print("Enter Height of Tetrahedron: ");
                                double Height_T = Double.parseDouble(write.readLine());

                                tetrahedron Tetrahedron = new tetrahedron(Base3,Height3);
                                Tetrahedron.setHeight_py(Height_T);
                                Tetrahedron.volume();
                                break;

                            default:
                                System.out.println("\n ===INVALID===");

                        }// ---Switch_case_end---
                    }

                    else if (choose_2 == 3){
                        // Create a Scanner object
                        Scanner in = new Scanner(System.in);

                        // ---Shape 3D >> Triangular Prism
                        System.out.println("\nHere is a selection from '3' :");
                        for (var choose1:Choose_Calc){
                            System.out.println(choose1);
                        }
                        System.out.println("What do you want to calculate? choose one: ");
                        int value_Shape3D = in.nextInt();
                        right_angled Right_Angled_;

                        switch (value_Shape3D){
                            case 1:
                                // ---Calculate the Perimeter of the base of Triangular Prism
                                System.out.print("\nPlease enter the total side value of the base of Triangular Prism: ");
                                double side_ = Double.parseDouble(write.readLine());

                                triangular_prism Triangular_Prism = new triangular_prism(0,0);
                                Triangular_Prism.setSide_total(side_);
                                Right_Angled_ = new triangular_prism(0,0);
                                Right_Angled_.perimeter();
                                break;

                            case 2:
                                // ---Calculate the Area of Triangular Prism
                                System.out.print("\nPlease enter the height of the triangle of Triangular Prism: ");
                                double sideHeight_ = Double.parseDouble(write.readLine());
                                System.out.print("Please enter the value of the base side of Triangular Prism: ");
                                double sideBase_ = Double.parseDouble(write.readLine());
                                System.out.print("Please enter the total side value of the base of Triangular Prism: ");
                                double sideTotal_ = Double.parseDouble(write.readLine());
                                System.out.print("Please enter the value of the height of Triangular Prism: ");
                                double Height_ = Double.parseDouble(write.readLine());

                                triangular_prism Triangular_Prism_ = new triangular_prism(sideBase_,sideHeight_);
                                Triangular_Prism_.setSide_total(sideTotal_);
                                Triangular_Prism_.setHeight_p(Height_);

                                Right_Angled_ = new triangular_prism(0,0);
                                Right_Angled_.area();
                                break;

                            case 3:
                                // ---Calculate the Volume of Triangular Prism
                                System.out.print("\nPlease enter the height of the triangle of Triangular Prism: ");
                                double sideHeight = Double.parseDouble(write.readLine());
                                System.out.print("Please enter the value of the base side of Triangular Prism: ");
                                double sideBase = Double.parseDouble(write.readLine());
                                System.out.print("Please enter the value of the height of Triangular Prism: ");
                                double Height_v = Double.parseDouble(write.readLine());

                                triangular_prism Triangular_Prism_v = new triangular_prism(sideBase,sideHeight);
                                Triangular_Prism_v.setHeight_p(Height_v);
                                Triangular_Prism_v.volume();
                                break;

                            default:
                                System.out.println("\n ===INVALID===");

                        }// ---Switch_case_end---
                    }
                    break;
            } // ---Switch_case_MainMenu_end---

        }
        catch (Exception e) {
            System.out.println(" \n >>>SOMETHING WENT WRONG!<<< \n === Your Input INVALID ===");
        }

    }// ---main_program_end---
}// ---main_class_end--
