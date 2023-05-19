package com.javacodebase.codingExercise;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Calculate Fibonacci for the 10th term
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
