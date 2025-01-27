package com.example.entendendo_algoritmos.capitulo03.recursividade;

public class Fatorial2 {
    public static void main(String[] args) {
        Fatorial2 fatorial2 = new Fatorial2();
        System.out.println(fatorial2.getFatorial(5));
    }

    public int getFatorial(int num) {
        if (isZeroOrUm(num))
            return 1;
        return num * getFatorial(num - 1);
    }

    public boolean isZeroOrUm(int n) {
        if (n > 1)
            return false;
        return true;
    }
}