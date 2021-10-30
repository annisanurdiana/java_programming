package com.midterm;

public class triangular_prism extends right_angled implements Volume {

    private double side_total; private double height_p;

    triangular_prism(double base_t, double height_t) {
        super(base_t, height_t);
    }

    // ----Call or return the value of an attribute to the caller
    public double getSide_total(){
        return side_total;
    }
    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setSide_total(double side_total){
        this.side_total = side_total;
    }


    // ----Call or return the value of an attribute to the caller
    public double getHeight_p(){
        return height_p;
    }

    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setHeight_p(double height_p){
        this.height_p = height_p;
    }

    public double getBaseArea(){
        return base_t*height_t*0.5;
    }

    //--------------------------------S_U_R_F_A_C_E__A_R_E_A---------------------------------//


    @Override
    public void area() {
        System.out.println("The area of the surface of triangular prism is = " + getArea());
    }

    @Override
    public double getArea() {
        // Surface area = t × (Base Perimeter) + (2 × La)
        return getHeight_p()*getPerimeter()+(2*getBaseArea());
    }

    //-----------------------------------P_E_R_I_M_E_T_E_R-----------------------------------//

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the base of triangular prism is = " + getPerimeter());
    }
    @Override
    public double getPerimeter() {
        // Surface perimeter of triangular prism
        return getSide_total();
    }

    //-------------------------------------V_O_L_U_M_E-------------------------------------//

    // --- Implement from "Volume" interface class ---
    @Override
    public double getVolume() {
        return (base_t*height_t*0.5)*getHeight_p();
    }
    // --- Implement from "Volume" interface class ---
    @Override
    public void volume() {
        System.out.println("The volume of triangular prism is = "+getVolume());
    }
}
