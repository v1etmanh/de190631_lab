package com.jmc.week1.excercise4;

import java.util.ArrayList;

public class Handle {

    public double SolveSuperlativeEquation(double a, double b) {
        if (a == 0 && b != 0) throw new IllegalArgumentException("No solution exists.");
        if (a == 0 && b == 0) return Double.POSITIVE_INFINITY;
        return -b / a;
    }

    public ArrayList<Double> SolveQuadraticEquation(double a, double b, double c) {
        ArrayList<Double> result = new ArrayList<>();
        if (a == 0) {
            try {
                result.add(SolveSuperlativeEquation(b, c));
            } catch (IllegalArgumentException e) {
                return null;
            }
            return result;
        }

        double lamda = b * b - 4 * a * c;
        if (lamda < 0) return null;
        double x1 = (-b + Math.sqrt(lamda)) / (2 * a);
        double x2 = (-b - Math.sqrt(lamda)) / (2 * a);
        result.add(x1);
        result.add(x2);
        return result;
    }

    public ArrayList<Integer> CheckOdd(double... numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (double num : numbers) {
            if (num % 1 == 0 && num % 2 == 1) {
                result.add((int) num);
            }
        }
        return result;
    }

    public ArrayList<Integer> CheckEven(double... numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (double num : numbers) {
            if (num % 1 == 0 && num % 2 == 0) {
                result.add((int) num);
            }
        }
        return result;
    }

    public ArrayList<Integer> CheckSquare(double... numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (double num : numbers) {
            int sqrt = (int) Math.sqrt(num);
            if (num % 1 == 0 && sqrt * sqrt == (int) num) {
                result.add((int) num);
            }
        }
        return result;
    }
}
