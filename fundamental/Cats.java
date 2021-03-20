package com.week4;

public class Cats extends Animal {

    public String race, habitat;

    public Cats(String race, String habitat){
        this.race = race;
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return  "Race of the cat: "+race+" and habitat in "+habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cats) {
            Cats other = (Cats) o;
            return this.race.equals(other.race);
        } else {
            return false;
        }
    }

    public Cats(){
        super(); // it is still call the constructor from parent class
        System.out.println(" This is Cats Class");
    }
    public void eating()/*Overriding*/{
        System.out.println(" The cat is eating.");
    }
    public void eating(int amount)/*Overloading*/{
        System.out.println(" My cats has eating "+amount+" fishes.");
    }

}
