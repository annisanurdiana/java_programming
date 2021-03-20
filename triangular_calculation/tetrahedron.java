package com.midterm;

public class tetrahedron extends equilateral implements Volume {

    private double height_py;

    tetrahedron(double base_t, double height_t) {
        super(base_t, height_t);
    }

    // ----Call or return the value of an attribute to the caller
    public double getHeight_py(){
        return height_py;
    }

    /* ---Setter modifies the value of an attribute based on the value sent by
        the caller using the input parameter */
    public void setHeight_py(double height_py){
        this.height_py = height_py;
    }


    //--------------------------------S_U_R_F_A_C_E__A_R_E_A---------------------------------//

    @Override
    public void area() {
        System.out.println("The area of the surface of tetrahedron is = " + getArea());
    }

    @Override
    public double getArea() {
        return 4 * (base_t*height_t*0.5); // 4 * AreaTriangle >> AreaTriangle = base * height * 0.5
    }

    //-----------------------------------P_E_R_I_M_E_T_E_R-----------------------------------//

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the base of tetrahedron is = " + getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (base_t*height_t)*0.5; // (alas.t)/2
    }


    //-------------------------------------V_O_L_U_M_E-------------------------------------//

    // --- Implement from "Volume" interface class ---
    @Override
    public double getVolume() {
        return (0.33*base_t*height_t*0.5)*getHeight_py();
    }
    // --- Implement from "Volume" interface class ---
    @Override
    public void volume() {
        System.out.println("The volume of Tetrahedron (Triangular Pyramid) is = "+getVolume());
    }

}
