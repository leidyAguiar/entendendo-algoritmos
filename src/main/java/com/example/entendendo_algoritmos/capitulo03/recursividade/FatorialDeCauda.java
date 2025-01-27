package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class FatorialDeCauda {
    public static void main(String[] args) {
        System.out.println(fatorial(0));
    }

    public static int fatorial(int n) {
        return fatorialRecursividadeDeCauda(n, 1);
    }

    public static int fatorialRecursividadeDeCauda(int n, int total) { // Parâmetros adicionais
        if (n == 0)
            return total;
        return fatorialRecursividadeDeCauda(n - 1, n * total);
    }
}
