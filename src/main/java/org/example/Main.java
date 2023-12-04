package org.example;

public class Main {
    private int var1,var2;
    private double pi;
    //static method to add two numbers
    private static int addTwoNumber(int x, int y){
        return x + y;
    }
    public Main(int var1, int var2, double pi) { // Constructor
        this.var1 = var1;
        this.var2 = var2;
        this.pi = pi;
    }
    //static method to calculate the area of circle
    private static double findAreaOfCircle(double radius){
        if(radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative");
        return Math.PI * radius * radius;
    }
    //static method to calculate the factorial of a number
    private static int factorial(int n){
        if(n < 0)
            throw new IllegalArgumentException("Number cannot be negative");
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }
    //static method to calculate the factorial of a number using loop
    private static long factorial_m(int n){
        if(n < 0)
            throw new IllegalArgumentException("Number cannot be negative");
        if(n == 0)
            return 1;
        long result = 1;
        for (int i = 1; i <=n ; i++) {
            result *= i;
        }
        return result;
    }
    //main method to run the program and test the methods
    public static void main(String[] args) {
        System.out.println("Addition result : " + addTwoNumber(12,3));
        //calculate the area of circle
        System.out.println("Area of circle : " + findAreaOfCircle(1));
        //show factorial of 5
        System.out.println("Factorial of 5 : " + factorial(5));
        //show factorial of 5 using loop
        System.out.println("Factorial of 5 using loop : " + factorial_m(5));
    }
}