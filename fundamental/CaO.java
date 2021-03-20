package com.week2;

class Student{
    // ---Object
    // Student student1 = new Student();

    // ---Field static supaya can access lansung without this
    public static String name;

    String Class; int age; double gpa;

    // ---Can't change manipulation in the field
    final String country = "Singapore";

    Student(String name, int age, double gpa){
        Student.name = "Kevin";
        this.age  = 19;
        this.gpa  = 3.35;
    }
    // ---Method or Function
    static void sayHello(String name){
        System.out.println("Hello, My Name is " + name);
    }

    // ---Constructor
    Student(String paramName, int paramAge){
        name = paramName;
        age = paramAge;
    }
    static void Intro(String paramName, int paramAge){
        System.out.println("Hello my name is "+paramName+" I am "+paramAge+" years old.");
    }
}

public class CaO {
    public static void Read(){
        System.out.println(" READ ");
    }
}
