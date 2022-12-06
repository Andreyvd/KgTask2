package ru.vsu.program;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

class TestTest {
    @Test
    void sumV() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        Vector w = new Vector(4, 7);
        Vector w1 = v.sumV(v.setVector(1, 2), v.setVector(3, 5));
        Vector w2 = new Vector(4, 7,2);
        Vector w3 = v1.sumV(v1.setVector(1, 2, 1), v1.setVector(3, 5, 1));
        Vector w4 = new Vector(4, 7,2,5);
        Vector w5 = v2.sumV(v2.setVector(1, 2, 1, 2), v2.setVector(3, 5, 1, 3));

        assert Objects.equals(v.getStringV(w), v.getStringV(w1));
        assert Objects.equals(v1.getStringV(w2), v1.getStringV(w3));
        assert Objects.equals(v2.getStringV(w4), v2.getStringV(w5));
    }

    @Test
    void difV() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        Vector w = new Vector(4, -3);
        Vector w1 = v.difV(v.setVector(7, 2), v.setVector(3, 5));
        Vector w2 = new Vector(-2, -3,0);
        Vector w3 = v1.difV(v1.setVector(1, 2, 1), v1.setVector(3, 5, 1));
        Vector w4 = new Vector(-2, -3,0,-1);
        Vector w5 = v2.difV(v2.setVector(1, 2, 1, 2), v2.setVector(3, 5, 1, 3));

        assert Objects.equals(v.getStringV(w), v.getStringV(w1));
        assert Objects.equals(v1.getStringV(w2), v1.getStringV(w3));
        assert Objects.equals(v2.getStringV(w4), v2.getStringV(w5));

    }

    @Test
    void multi() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        Vector w = new Vector(5, 10);
        Vector w1 = v.multi(v.setVector(1, 2), 5);
        Vector w2 = new Vector(5, 10, 5);
        Vector w3 = v1.multi(v1.setVector(1, 2, 1), 5);
        Vector w4 = new Vector(5, 10, 5 , 15);
        Vector w5 = v2.multi(v2.setVector(1, 2, 1, 3), 5);

        assert Objects.equals(v.getStringV(w2), v.getStringV(w3));
        assert Objects.equals(v.getStringV(w), v.getStringV(w1));
        assert Objects.equals(v.getStringV(w4), v.getStringV(w5));
    }

    @Test
    void length() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        assert Math.sqrt(5) == v.length(v.setVector(1, 2));
        assert Math.sqrt(30) == v1.length(v1.setVector(1, 2, 5));
        assert Math.sqrt(249) == v2.length(v2.setVector(1, 2 , 10, 12));
    }

    @Test
    void norm() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        Vector w = new Vector(0.6, 0.8);
        Vector w1 = new Vector(1.0 / 9.0 , 8.0 / 9.0, 4.0 / 9.0 );
        Vector w2 = new Vector(1.0 / 6.0, 1.0 / 6.0, 5.0 / 6.0, 3.0 / 6.0);
        assert Objects.equals(v.getStringV(v.norm(v.setVector(3, 4))), v.getStringV(w));
        assert Objects.equals(v1.getStringV(v1.norm(v1.setVector(1, 8, 4))), v1.getStringV(w1));
        assert Objects.equals(v2.getStringV(v2.norm(v2.setVector(1, 1,5,3))), v2.getStringV(w2));
    }

    @Test
    void scalarProduct() {
        VectorTwo v = new VectorTwo();
        VectorThree v1 = new VectorThree();
        VectorFour v2 = new VectorFour();
        assert v.scalarProduct(v.setVector(1, 2), v.setVector(4, 6)) == 16;
        assert v1.scalarProduct(v1.setVector(1, 2,3), v1.setVector(4, 6,4)) == 28;
        assert v2.scalarProduct(v2.setVector(1, 2 ,3, 5), v2.setVector(4, 6 , 5 , 9)) == 76;
    }

    @Test
    void vectorProduct() {
        VectorThree v = new VectorThree();
        Vector v1 = v.vectorProduct(v.setVector(1, 2, 3), v.setVector(2, 3, 4));
        Vector v2 = new Vector(-1, 2, -1);
        assert Objects.equals(v.getStringV(v1), v.getStringV(v2));
    }

    @Test
    void sumMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        double[][] m2 = {{5, 6, 7}, {2, 3, 4}, {5, 6, 8}};
        double[][] res = {{6, 8, 10}, {4, 6, 8}, {10, 12, 15}};
        double[][] m3 = {{1, 2, 3, 1}, {2, 3, 4, 2}, {5, 6, 7, 3},{1,2,3, 4}};
        double[][] m4 = {{5, 6, 7 , 1}, {2, 3, 4, 2}, {5, 6, 8, 3},{1,2,3, 4}};
        double[][] res2 = {{6, 8, 10, 2}, {4, 6, 8, 4}, {10, 12, 15, 6},{2,4,6, 8}};
        assert Arrays.deepEquals(m.sumMatrix(m1, m2), res);
        assert Arrays.deepEquals(m0.sumMatrix(m3, m4), res2);
    }

    @Test
    void difMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        double[][] m2 = {{5, 6, 7}, {2, 3, 4}, {5, 6, 8}};
        double[][] res = {{4, 4, 4}, {0, 0, 0}, {0, 0, 1}};
        double[][] m3 = {{1, 2, 3, 1}, {2, 3, 4, 2}, {5, 6, 7, 3},{1,2,3, 4}};
        double[][] m4 = {{5, 6, 7 , 1}, {2, 3, 4, 2}, {5, 6, 8, 3},{1,2,3, 4}};
        double[][] res2 = {{-4, -4, -4, 0}, {0, 0, 0, 0}, {0, 0, -1, 0},{0,0,0, 0}};
        assert Arrays.deepEquals(m0.difMatrix(m3, m4), res2);
        assert Arrays.deepEquals(m.difMatrix(m2, m1), res);
    }

    @Test
    void multiV() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        double[] m2 = {5, 6, 7};
        double[] res = {38, 56, 110};
        double[][] m3 = {{1, 2, 3,1}, {2, 3, 4,2}, {5, 6, 7,3},{1,2,3,4}};
        double[] m4 = {5, 6, 7,8};
        double[] res2 = {46, 72, 134,70};
        assert Arrays.equals(m.multiV(m1, m2), res);
        assert Arrays.equals(m0.multiV(m3, m4), res2);
    }

    @Test
    void multiMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        double[][] m2 = {{5, 6, 7}, {2, 3, 4}, {5, 6, 8}};
        double[][] res = {{24, 30, 39}, {36, 45, 58}, {72, 90, 115}};
        double[][] m3 = {{1, 2, 3,1}, {2, 3, 4,2}, {5, 6, 7,3},{1,2,3,4}};
        double[][] m4 = {{5, 1, 2,3}, {6, 3, 4,4}, {7, 3, 4,6},{8,4,7,0}};
        double[][] res2 = {{46, 20, 29,29}, {72, 31, 46,42},{134,56,83,81}, {70, 32, 50, 29}};
        assert Arrays.deepEquals(m.multiMatrix(m1, m2), res);
        assert Arrays.deepEquals(m0.multiMatrix(m3, m4), res2);
    }

    @Test
    void transposeMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        double[][] m2 = {{1, 2, 3,1}, {2, 3, 4,2}, {5, 6, 7,3},{1,2,3,4}};
        double[][] res = {{1, 2, 5}, {2, 3, 6}, {3, 4, 7}};
        double[][] res2 = {{1, 2, 5,1}, {2, 3, 6,2}, {3, 4, 7,3},{1,2,3,4}};
        assert Arrays.deepEquals(m.transposeMatrix(m1), res);
        assert Arrays.deepEquals(m0.transposeMatrix(m2), res2);
    }

    @Test
    void zeroMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] res = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        double[][] res2 = {{0, 0, 0,0}, {0, 0, 0,0}, {0, 0, 0,0},{0,0,0,0}};
        assert Arrays.deepEquals(m.zeroMatrix(), res);
        assert Arrays.deepEquals(m0.zeroMatrix(), res2);
    }

    @Test
    void OneMatrix() {
        MatrixThree m = new MatrixThree();
        MatrixFour m0 = new MatrixFour();
        double[][] res = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        double[][] res2 = {{1, 0, 0,0}, {0, 1, 0,0}, {0, 0, 1,0},{0,0,0,1}};
        assert Arrays.deepEquals(m.OneMatrix(), res);
        assert Arrays.deepEquals(m0.OneMatrix(), res2);
    }

}