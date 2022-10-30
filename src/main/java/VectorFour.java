public class VectorFour {
    public Vector setVector(double k1, double k2,double k3, double k4) {
        return new Vector(k1,k2,k3,k4);
    }

    public String getStringV(Vector v){
        return v.getA() + ", " + v.getB() + ", " + v.getC() + ", " + v.getD();
    }

    public Vector sumV(Vector v1, Vector v2){
        return new Vector(v1.getA() + v2.getA(), v1.getB() + v2.getB(),v1.getC() + v2.getC(), v1.getD() + v2.getD() );
    }

    public Vector difV(Vector v1, Vector v2){
        return new Vector(v1.getA() - v2.getA(), v1.getB() - v2.getB(), v1.getC() - v2.getC(), v1.getD() - v2.getD());
    }

    public  Vector multi(Vector v, double n){
        return new Vector(v.getA() * n, v.getB() * n, v.getC() * n, v.getD() * n );
    }

    public double length(Vector v){
        return Math.sqrt(v.getA() * v.getA() + v.getB() * v.getB() + v.getC() * v.getC() + v.getD() * v.getD() );
    }

    public Vector norm(Vector v) {
        return new Vector(v.getA() / length(v), v.getB()/length(v), v.getC()/length(v), v.getD()/length(v) );
    }

    public double scalarProduct(Vector v1, Vector v2){
        return v1.getA() * v2.getA() + v1.getB() * v2.getB() + v1.getC() * v2.getC() + v1.getD() * v2.getD();
    }
}
