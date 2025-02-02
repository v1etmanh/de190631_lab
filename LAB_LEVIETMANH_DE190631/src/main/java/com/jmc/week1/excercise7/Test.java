package com.jmc.week1.excercise7;
public class Test {

    public static Matrix initialMatrix() {
        int rows = Utils.getIntValue("Enter positive integer for rows of matrix: ");
        int columns = Utils.getIntValue("Enter positive integer for columns of matrix: ");
        return new Matrix(rows, columns);
    }

    public static void insertIntoMatrix(Matrix matrix) {
        System.out.println("Enter values of matrix (" + matrix.getRows() + "x" + matrix.getCollumns() + "):");
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCollumns(); j++) {
                double in = Utils.getDoubleValue("Enter value at position [" + (i+1) + "," + (j+1) + "]: ");
                matrix.getMatrix()[i][j] = in;
            }
        }
    }

    public static void main(String[] args) {
        int option;
        MatrixManager matrixManager=new MatrixManager(null);

        // Menu loop
        while (true) {
            System.out.println("\n===== Matrix Operations Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            option = Utils.getIntValue("Choose an option: ");
            matrixManager.setMatrixs(null);
            switch (option) {
                case 1:
                    try {
                        System.out.println("Enter row and column of matrix A, and matrix B (matrices must have same dimensions for addition):");
                        Matrix matrix1 = initialMatrix();
                        Matrix matrix2 = matrix1;
                        if (matrix1.getRows() != matrix2.getRows() || matrix1.getCollumns() != matrix2.getCollumns()) {
                            System.out.println("Matrix dimensions do not match for addition.");
                            break;
                        }
                        insertIntoMatrix(matrix1);
                        insertIntoMatrix(matrix2);
                        matrixManager = new MatrixManager(matrix1);
                        Matrix result = matrixManager.Adding(matrix2);
                        System.out.println("Result of Addition:");
                        result.display();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter row and column of matrix A, and matrix B (matrices must have same dimensions for subtraction):");
                        Matrix matrix1 = initialMatrix();
                        Matrix matrix2 = matrix1;
                        if (matrix1.getRows() != matrix2.getRows() || matrix1.getCollumns() != matrix2.getCollumns()) {
                            System.out.println("Matrix dimensions do not match for subtraction.");
                            break;
                        }
                        insertIntoMatrix(matrix1);
                        insertIntoMatrix(matrix2);
                        matrixManager = new MatrixManager(matrix1);
                        Matrix result = matrixManager.Subtract(matrix2);
                        System.out.println("Result of Subtraction:");
                        result.display();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter row and column of matrix A, and matrix B (for multiplication, columns of matrix A must equal rows of matrix B):");
                        Matrix matrix1 = initialMatrix();
                        Matrix matrix2 = initialMatrix();
                        if (matrix1.getCollumns() != matrix2.getRows()) {
                            System.out.println("Matrix dimensions do not match for multiplication.");
                            break;
                        }
                        insertIntoMatrix(matrix1);
                        insertIntoMatrix(matrix2);
                        matrixManager = new MatrixManager(matrix1);
                        Matrix result = matrixManager.Multiple(matrix2);
                        System.out.println("Result of Multiplication:");
                        result.display();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
