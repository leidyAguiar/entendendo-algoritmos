package com.example.entendendo_algoritmos.capitulo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenacaoPorSelecao {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(ordenacaoPorSelecao(lista)); // [2, 3, 5, 6, 10]
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>(arr.size());
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int menor = buscarMenor(arr);
            novoArr.add(arr.remove(menor));
        }
        return novoArr;
    }

    public static int buscarMenor(List<Integer> array) {
        int menor = array.get(0);
        int menor_indice = 0;

        for (int i = 1; i < array.size(); i++) {
            int elemento = array.get(i);

            if (elemento < menor){
                menor = array.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }
}