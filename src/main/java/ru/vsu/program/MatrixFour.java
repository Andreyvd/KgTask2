package ru.vsu.program;

public class MatrixFour {

    double[][] sumMatrix(double[][] m1, double[][] m2){
        double[][] m = new double[4][4];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m[i][j] =  m1[i][j] + m2[i][j];
            }
        }
        return m;
    }

    double[][] difMatrix(double[][] m1, double[][] m2 ){
        double[][] m = new double[4][4];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[0].length; j++){
                m[i][j] =  m1[i][j] - m2[i][j];
            }
        }
        return m;
    }

    double[] multiV(double[][] m1,  double[] v1) {
        double[] v = new double[4];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                v[i] += m1[i][j] * v1[j];
            }
        }
        return v;
    }

    double[][] multiMatrix(double[][] m1, double[][] m2) {
        double[][] m = new double[4][4];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                for (int k = 0; k < m1.length; k++) {
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m;
    }

    public  double[][] transposeMatrix(double[][] m1){
        double[][] m = new double[4][4];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m[j][i] = m1[i][j];
            }
        }
        return m;
    }

    public double[][] zeroMatrix() {
        double[][] m = new double[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = 0;
            }
        }
        return m;
    }

    public double[][] OneMatrix(){
        double[][] m = new double[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i == j){
                    m[i][j] = 1;
                }else {
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }
}
