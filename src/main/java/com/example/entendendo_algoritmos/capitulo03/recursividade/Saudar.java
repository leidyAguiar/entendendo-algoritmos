package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class Saudar {
    public static void main(String[] args) {
        saudar("adit");
    }

    private static void saudar2(String nome) {
        System.out.println("Como vai " + nome + "?");
    }

    private static void tchau() {
        System.out.println("ok, tchau!");
    }

    private static void saudar(String nome) {
        System.out.println("Olá, " + nome + "!");
        saudar2(nome);
        System.out.println("preparando para dizer tchau...");
        tchau();
    }
}