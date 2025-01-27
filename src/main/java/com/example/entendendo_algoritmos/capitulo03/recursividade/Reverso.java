package com.example.entendendo_algoritmos.capitulo03.recursividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverso {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("roxo", "azul", "verde", "preto", "rosa", "amarelo");
        List<String> resultado = reverso(lista);

        System.out.println(resultado);
    }

    public static <T> List<T> reverso(List<T> list) {
        if (list.size() <= 1)
            return new ArrayList<>(list);

        T cabeca = list.get(0);
        List<T> cauda = list.subList(1, list.size());

        List<T> newList = reverso(cauda);
        newList.add(cabeca);

        return newList;
    }
}

// O primeiro elemento é a cabeça da lista, sempre vai para o último lugar.
// Reverso de uma lista, vai ser a reversa da cauda concatenada com a cabeça no final.
// reverso([0, 1, 2, 3, ..... n]) = reverso([1, 2, 3, .... n]) + [0]
// cauda[1] + cabeca[0]