package com.midterm;

public class t_pyramid extends isosceles implements Volume{

    private double Height;private double Frame;private double areaTriangle;

    t_pyramid(double base_t, double height_t) {
        super(base_t, height_t);
    }


    // ----Call or return the value of an attribute to the caller
    public double getHeight(){
        return Height;
    }

    /* ---Setter modifies the value of an attribute based on the value sent by
    the caller using the input parameter */
    public void setHeight(double Height){
        this.Height = Height;
    }

    // ----Call or return the value of an attribute to the caller
    public double getFrame(){
        return Frame;
    }

    /* ---Setter modifies the value of an attribute based on the value sent by
    the caller using the input parameter */
    public void setFrame(double Frame){
        this.Frame = Frame;
    }


    //--------------------------------S_U_R_F_A_C_E__A_R_E_A---------------------------------//


    // ----Call or return the value of an attribute to the caller
    public double getAreaTriangle(){
        return areaTriangle;
    }

    /* ---Setter modifies the value of an attribute based on the value sent by
    the caller using the input parameter */
    public void setAreaTriangle(double areaTriangle){
        this.areaTriangle = areaTriangle;
    }

    // --- Inherit from "isosceles" class ---
    @Override
    public void area() {
        System.out.println("The area of pyramid is = "+getArea());
    }

    // --- Inherit from "isosceles" class ---
    @Override
    public double getArea() {
        // Formula of surface area = Area.rectangle + 4*Area.triangle
        return Math.pow(base_t,2) + 4 * getAreaTriangle();
    }

    //-----------------------------------P_E_R_I_M_E_T_E_R-----------------------------------//

    // --- Inherit from "isosceles" class ---
    @Override
    public void perimeter() {
        System.out.println("The perimeter of pyramid is = "+getPerimeter());
    }

    // --- Inherit from "isosceles" class ---
    @Override
    public double getPerimeter() {
        // Formula of Pyramid frame length total = perimeter of rectangle + 4*f
        return 4 * base_t + 4 * getFrame();
    }



    //-----------------------------------V_O_L_U_M_E-----------------------------------//

    // --- Implement from "Volume" interface class ---
    @Override
    public double getVolume() {
        // Formula of volume = 1/2 * area.rectangle * height
        return 0.5 * Math.pow(base_t,2) * getHeight();
    }

    // --- Implement from "Volume" interface class ---
    @Override
    public void volume() {
        System.out.println("The volume of pyramid is = "+getVolume());
    }

    // ---Declare Public Modifier to Display base_side_diagonal of pyramid---
    public void side_diagonal(){
        // Find the side of the base. Diagonal side of the triangle
        System.out.println("The Side Diagonal of the base of pyramid is = "+base_t+"√2");
    }

    // ---Declare Public Modifier to Display base_side_diagonal of pyramid---
    public void perpendicular_diagonal(){
        // Find the perpendicular diagonals on the perpendicular side. Diagonal side of the square
        System.out.println("The perpendicular diagonals on the perpendicular side" +
                " of the pyramid is = "+0.5*base_t+"√3");
    }
}
