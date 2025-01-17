package com.example.entendendo_algoritmos.capitulo01;

public class PesquisaBinaria {
    public static void main(String[] args) {

        int[] lista = {1, 3, 5, 7, 9};

        System.out.println(pesquisaBinaria(lista, 3));
        System.out.println(pesquisaBinaria(lista, -1));
    }

    public static int pesquisaBinaria(int[] lista, int elemento) {
        int inicio = 0;
        int fim = lista.length - 1;
        int meio, chute;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            chute = lista[meio];
            if (chute == elemento)
                return meio;
            if (chute > elemento)
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return -1;
    }
}