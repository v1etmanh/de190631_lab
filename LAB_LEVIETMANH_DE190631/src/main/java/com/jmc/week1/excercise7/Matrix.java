package com.jmc.week1.excercise7;

import java.util.Arrays;

public class Matrix {
    private int rows, collumns;
    private double[][]matrix;

    public Matrix(int rows, int collumns) {
        this.rows = rows;
        this.collumns = collumns;
        this.matrix=new double[rows][collumns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollumns() {
        return collumns;
    }

    public void setCollumns(int collumns) {
        this.collumns = collumns;
    }

    public double[][] getMatrix() {
        return matrix;
    }
    public double getValue(int i, int j) {
        return matrix[i][j];
    }

  public void display(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<collumns;j++)
            {System.out.print(matrix[i][j]+" |");}
            System.out.println("|");
        }
  }
    public Matrix Adding(Matrix b) throws Exception {

        if(this.getRows()==b.getRows()&&this.getCollumns()==b.getCollumns()) {

            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getCollumns(); j++) {
                    this.getMatrix()[i][j]+=b.getMatrix()[i][j];
                }
            }

            return this;
        }
        else {
            throw new Exception("not valid require for this opperation");
        }
    }
    public Matrix Subtract(Matrix b) throws Exception {

        if(this.getRows()==b.getRows()&&this.getCollumns()==b.getCollumns()) {

            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j <this.getCollumns(); j++) {
                    this.getMatrix()[i][j]-=b.getMatrix()[i][j];
                }
            }

            return this;
        }
        else {
            throw new Exception("not valid require for this opperation");
        }
    }
    public Matrix Multiple(Matrix b) throws Exception {
        if (this.getCollumns() != b.getRows()) {
            throw new Exception("Number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
        }
        Matrix result= new Matrix(this.getRows(),b.getCollumns());
        double x=0;

        for(int i=0;i<result.getRows();i++){
            for(int j=0;j<result.getCollumns();j++){
                for(int k=0;k<this.getCollumns();k++)
                {
                    x+=matrix[i][k]*b.getMatrix()[k][j];
                }
                result.getMatrix()[i][j]=x;
            }
             matrix=result.matrix;
        }
        return this;
    }
}
