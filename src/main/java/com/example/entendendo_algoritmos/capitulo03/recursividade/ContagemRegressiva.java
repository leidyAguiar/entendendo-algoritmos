package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class ContagemRegressiva {
    public static void main(String[] args) {
        regressiva(5);
    }

    public static void regressiva(int num) {
        System.out.println(num);
        if (num <= 1) // caso-base
            return;
        else // caso-recursivo
            regressiva(num - 1);
    }
}