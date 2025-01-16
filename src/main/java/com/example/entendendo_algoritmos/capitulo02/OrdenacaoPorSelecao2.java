package com.example.entendendo_algoritmos.capitulo02;

import java.util.Arrays;

public class OrdenacaoPorSelecao2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10, 8};
        ordenacaoPorSelecao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ordenacaoPorSelecao(int[] array) {
        int i, j, menor;
        for (i = 0; i < array.length; i++) {
            menor = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    int aux = array[j];
                    array[j] = array[menor];
                    array[menor] = aux;
                }
            }
        }
    }
}