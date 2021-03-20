package com.week2;
import com.week2.CharacterPack.*;
class Animal{
    public String speak;
    String name; int weight;

    public void SaySomething(){
        System.out.println("Hello Human!");
    }
    public void Speak(String word){
        System.out.println("This is my sound "+word);
    }
    public int getWeight(){
        return this.weight;
    }
}
public class MyProgram {
    public static void main(String [] args){
        Animal cat = new Animal();
        cat.name = "Cyllu";
        cat.weight = 5;
        cat.SaySomething();
        cat.Speak("Meoouww");
        System.out.println("--------------------------"+cat.speak);
        System.out.println("Let me introduce my cat\nI have a cat and the name of my cat is "+cat.name+" and the weight of my cat is "+ cat.weight);

        // Call object from CharacterPack
        Car car1 = new Car("Avanza",8,98.4);
        Car car2 = new Car("Kijang Innova",2,110.5);
        Customer customer1 = new Customer("Doni",31,"male");

        car1.Display();
        customer1.Display();
    }
}
