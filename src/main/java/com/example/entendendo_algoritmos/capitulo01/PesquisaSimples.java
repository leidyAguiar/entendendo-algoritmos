package com.example.entendendo_algoritmos.capitulo01;

public class PesquisaSimples {
    public static void main(String[] args) {

        int[] lista = {1, 3, 5, 7, 9};

        System.out.println(buscaSequencial(lista, 5));
        System.out.println(buscaSequencial(lista, 9));
        System.out.println(buscaSequencial(lista, 2));
    }

    public static int buscaSequencial(int[] array, int elemento) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (elemento == array[i])
                return i;
        }
        return -1;
    }
}