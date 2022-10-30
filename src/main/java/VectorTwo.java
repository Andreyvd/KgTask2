public class VectorTwo {

    public Vector setVector(double k1, double k2) {
        return new Vector(k1,k2);
    }

    public String getStringV(Vector v){
        return v.getA() + ", " + v.getB();
    }

    public Vector sumV(Vector v1, Vector v2){
         return new Vector(v1.getA() + v2.getA(), v1.getB() + v2.getB());
    }

    public Vector difV(Vector v1, Vector v2){
        return new Vector(v1.getA() - v2.getA(), v1.getB() - v2.getB());
    }

    public  Vector multi(Vector v, double n){
        return new Vector(v.getA() * n, v.getB() * n);
    }

    public double length(Vector v){
        return Math.sqrt(v.getA() * v.getA() + v.getB() * v.getB());
    }

    public Vector norm(Vector v) {
        return new Vector(v.getA() / length(v), v.getB()/length(v));
    }

    public double scalarProduct(Vector v1, Vector v2){
        return v1.getA() * v2.getA() + v1.getB() * v2.getB();
    }

}
