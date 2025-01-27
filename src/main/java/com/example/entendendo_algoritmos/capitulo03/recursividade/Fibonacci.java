package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(45));
    }

    public static int fibonacci(int n) {
        if (n == 0) // caso-base
            return 0;
        if (n == 1) // caso-base
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); // caso-recursivo
    }
}

// Solução ineficiente, pois faz vários cálculos repetidos
// Recursividade de Cauda será a solução para o cálculo do fibonacci