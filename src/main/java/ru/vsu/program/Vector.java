package ru.vsu.program;

public class Vector {
    private double a;
    private double b;
    private double c;
    private double d;

    public Vector(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Vector(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }
}
