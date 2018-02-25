package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b){
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException aE) {
            System.out.println("Error! b = 0 " + aE);
        } finally {
            System.out.println("Calculating...");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}