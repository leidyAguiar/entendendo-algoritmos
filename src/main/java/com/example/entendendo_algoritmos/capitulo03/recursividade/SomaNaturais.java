package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class SomaNaturais {
    public static void main(String[] args) {
        System.out.println(somaNaturais(3));
    }

    public static int somaNaturais(int num) {
        if (num == 0) // caso-base
            return 0;
        return num + somaNaturais(num - 1); // caso-recursivo
    }
}