package com.week2;
// ---A special class
enum Gender{
    Male, Female
}
class Character{
    public String name;public int health;public Gender gender;

    public Character() { // constructor
        this.name = "ABC";
        this.health = 100;
        this.gender = Gender.Male;
    }
    public void status() {
// ---Show character status
        System.out.format("Name: %s\nHealth: %d\nGender: %s\n", this.name, this.health, this.gender);
    }
}

// ---Constructors---
class Customer{

    public String name; public String gender; public int age;

    Customer(String name,int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Name \t: "+name);
        System.out.println("Age \t: "+age+ " years old.");
        System.out.println("Gender \t: "+gender);
        System.out.println("\n");
    }
    void Display(){
        System.out.println("=================================");
        System.out.println("Name   : "+this.name);
        System.out.println("Gender  : $."+this.gender);
        System.out.println("Age    : "+this.age+" years.\n");
    }
}
class Car{
    public String carName; int carAge; double carPrice;

    Car(String carName, int carAge, double carPrice){
        this.carName = carName;
        this.carAge = carAge;
        this.carPrice = carPrice;
        System.out.println("Name \t: "+carName);
        System.out.println("Age \t: "+carAge+ " years.");
        System.out.println("Price \t: "+carPrice);
        System.out.println("\n");
    }

    void Display(){
        System.out.println("=================================");
        System.out.println("Name   : "+this.carName);
        System.out.println("Price  : $."+this.carPrice);
        System.out.println("Age    : "+this.carAge+" years.\n");
    }
}

public class CharacterPack {
    public static void main(String[]args){

    }
}
