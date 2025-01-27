package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class FibonacciDeCauda {
    public static void main(String[] args) {
        System.out.println(fibonacci(45));
    }

    public static int fibonacci(int n) {
        return fibonacciRecursividadeDeCauda(n, 0, 1);
    }

    // Solução de complexidade linear
    public static int fibonacciRecursividadeDeCauda(int n, int a, int b) { // Parâmetros adicionais
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fibonacciRecursividadeDeCauda(n - 1, b, a + b);
    }
}