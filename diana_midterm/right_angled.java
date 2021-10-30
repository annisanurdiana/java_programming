package com.midterm;

public class right_angled extends Triangle{

    private double hypotenuse; // the hypotenuse of right_angled triangle

    right_angled(double base_t, double height_t) {
        super(base_t, height_t);
    }

    // ----Call or return the value of an attribute to the caller
    public double getHypotenuse(){
        return hypotenuse;
    }
    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setHypotenuse(double side_m){
        this.hypotenuse = side_m;
    }

    public double getCalcHypotenuse(){
        return Math.sqrt(Math.pow(base_t,2)+Math.pow(height_t,2));
    }
    public void Hypotenuse() {
        System.out.println("The Hypotenuse of right angled triangle is = "+getCalcHypotenuse());
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
        // Formula = side_h + side_w + side_m
        return base_t + height_t + getHypotenuse();
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public void area() {
        System.out.println("The area of right angled triangle is = "+getArea());
    }

    // --- Inherit from "Triangle" class ---
    @Override
    public void perimeter() {
        System.out.println("The perimeter of right angled triangle is = "+getPerimeter());
    }

}
