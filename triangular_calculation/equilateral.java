package com.midterm;

public class equilateral extends Triangle{

    private double side;
    equilateral(double base_t, double height_t) {
        super(base_t, height_t);
    }

    // ----Call or return the value of an attribute to the caller
    public double getSide(){
        return side;
    }
    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setSide(double side){
        this.side = side;
    }


    // --- Inherit from "Triangle" class ---
    @Override
    public double getArea() {
        // Formula = (a.t)/2
        return base_t*height_t*0.5;
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public double getPerimeter() {
        // Formula = 3 * side
        return 3 * side;
    }


    // --- Inherit from "Triangle" class ---
    @Override
    public void area() {
        System.out.println("The area of equilateral triangle is = "+getArea());
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public void perimeter() {
        System.out.println("The perimeter of equilateral triangle is = "+getPerimeter());
    }

}
