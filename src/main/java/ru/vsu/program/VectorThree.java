package ru.vsu.program;

public class VectorThree {
    public Vector setVector(double k1, double k2, double k3) {
        return new Vector(k1,k2,k3);
    }

    public String getStringV(Vector v){
        return v.getA() + ", " + v.getB() + "," + v.getC();
    }

    public Vector sumV(Vector v1, Vector v2){
        return new Vector(v1.getA() + v2.getA(), v1.getB() + v2.getB(), v1.getC() + v2.getC());
    }

    public Vector difV(Vector v1, Vector v2){
        return new Vector(v1.getA() - v2.getA(), v1.getB() - v2.getB(), v1.getC() - v2.getC());
    }

    public  Vector multi(Vector v, double n){
        return new Vector(v.getA() * n, v.getB() * n, v.getC() * n);
    }

    public double length(Vector v){
        return Math.sqrt(v.getA() * v.getA() + v.getB() * v.getB() + v.getC() * v.getC());
    }

    public Vector norm(Vector v) {
        return new Vector(v.getA() / length(v), v.getB()/length(v), v.getC()/length(v));
    }

    public double scalarProduct(Vector v1, Vector v2){
        return v1.getA() * v2.getA() + v1.getB() * v2.getB() + v1.getC() * v2.getC();
    }

    public Vector vectorProduct(Vector v1, Vector v2){
        double x  = v1.getB() * v2.getC() - v2.getB() * v1.getC();
        double y  = v1.getA() * v2.getC() - v2.getA() * v1.getC();
        double z  = v1.getA() * v2.getB() - v2.getA() * v1.getB();
        return new Vector(x,-y,z);
    }

}
