package com.midterm;

public abstract class Triangle {
    double base_t;double height_t;

    Triangle(double base_t, double height_t) {
        this.base_t = base_t;
        this.height_t = height_t;
    }

    public abstract void area();

    public abstract void perimeter();

    public abstract double getArea();

    public abstract double getPerimeter();
}
