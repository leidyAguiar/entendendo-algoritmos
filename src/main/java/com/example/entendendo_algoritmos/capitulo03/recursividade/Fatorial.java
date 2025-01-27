package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int n) {
        if (n == 0) // caso-base
            return 1;
        else // caso-recursivo
            return n * fatorial(n - 1);
    }
}