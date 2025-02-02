package com.jmc.week1.excercise7;

import java.util.ArrayList;

public class MatrixManager {
    private Matrix matrixs;

    public MatrixManager(Matrix a) {
        matrixs = a;
    }

    public Matrix Adding(Matrix b) throws Exception {

        return matrixs.Adding(b);


    }

    public Matrix Subtract(Matrix b) throws Exception {
        return matrixs.Subtract(b);
    }

    public Matrix Multiple(Matrix c) throws Exception {
       return matrixs.Multiple(c);
    }

    public Matrix getMatrixs() {
        return matrixs;
    }

    public void setMatrixs(Matrix matrixs) {
        this.matrixs = matrixs;
    }
}