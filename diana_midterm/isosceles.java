package com.midterm;

public class isosceles extends Triangle{

    private double side_1; // Side 1
    private double side_2; // Side 2

    isosceles(double base_t, double height_t) {
        super(base_t, height_t);
    }


    // ----Call or return the value of an attribute to the caller
    public double getSide_1(){
        return side_1;
    }
    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setSide_1(double side_1){
        this.side_1 = side_1;
    }


    // ----Call or return the value of an attribute to the caller
    public double getSide_2(){
        return side_2;
    }
    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setSide_2(double side_2){
        this.side_2 = side_2;
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
        // Formula = (side_1*2) + side_2
        return (getSide_1() *2) + getSide_2();
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public void area() {
        System.out.println("The area of isosceles triangle is = "+getArea());
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public void perimeter() {
        System.out.println("The perimeter of isosceles triangle is = "+getPerimeter());
    }

}
