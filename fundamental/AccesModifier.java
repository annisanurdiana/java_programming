package com.week3.packone;
/*
Private   = Only has access restrictions from within the class.
Default   = Modifier which has limitations in one package.
Protected = Access from outside the package as long as the class is an instance of it.
Public    = Globally accessible.
*/

// --Encapsulation is a method for bundling data and methods in the class.

public class AccesModifier {
    public static void main(String[]args){
        A a = new A();
//      The default access modifier cannot be accessed from outside the package.
        System.out.println(a.function_B());
        System.out.println(a.member_z);
        System.out.println(a.function_C());
    }
}
