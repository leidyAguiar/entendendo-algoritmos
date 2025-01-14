A pesquisa binária só funciona quando a sua lista está ordenada.

- O(log n) [Pesquisa Binária] - também conhecido como ***tempo logarítmico***.
- O(n) [Pesquisa Simples] - conhecido como ***tempo linear***.

Quando você procura um elemento usando a pesquisa simples, no pior dos casos, terá de analisar elemento por elemento, passando por todos.
Por exemplo, se for uma lista de 16 elementos, precisa checar no máximo os 16 números.
Na pesquisa binária, precisa verificar log n elementos no pior dos casos.
Para uma lista de 16 elementos, log 16 == 4, porque 2 elevado a 4 é igual a 16. Para essa lista, precisaria passar por, no máximo, 4 tentativas.

```java
public class PesquisaBinaria {
public static void main(String[] args) {

             // índice 0, 1, 2, 3, 4  
        int[] lista = {1, 3, 5, 7, 9};

        System.out.println(pesquisa_binaria(lista, 3)); // Deve retornar 1
        System.out.println(pesquisa_binaria(lista, -1)); // Deve retornar -1
    }

    public static int pesquisa_binaria(int[] lista, int elemento) {
        int inicio = 0; // índice inicial
        int fim = lista.length - 1; // Calculando o índice do meio da lista
        int meio, chute; // meio é o índice central e chute é o valor do elemento no índice meio

        while (inicio <= fim) { // Enquanto existir elementos a serem procurados na lista
            meio = (inicio + fim) / 2; // Calcula o índice central, ou seja, índice => 2 = (0 + 4) / 2
            chute = lista[meio]; // Elemento no índice central, ou seja, elemento(chute) = 5
            if (chute == elemento) // Comparando o elemento do meio com o elemento buscado 
                return meio; // Se forem iguais, retorna o índice do meio
            if (chute > elemento) // Se o elemento central for maior que elemento procurado
                fim = meio - 1; // Ajusta o fim para buscar na metade à esquerda
            else // Se o elemento do meio for menor que o elemento buscado
                inicio = meio + 1; // Ajusta o início para buscar na metade à direita
        }
        return -1; // Se os limites se cruzarem e elemento não for encontrado
    }
}
```

Para ilustrar esse algoritmo, vamos usar um exemplo simples. Suponha que temos uma lista de números ordenados listados abaixo e queremos encontrar o número 3. A lista é a seguinte:

[1, 3, 5, 7, 9]

O primeiro passo é comparar o número 3 com o elemento do meio da lista, que é o número 5. Como 3 é menor que 5, descartamos a metade direita da lista e continuamos a busca na metade esquerda:

[1, 3]

O segundo passo é comparar o número 3 com o elemento do meio da nova lista, que é o número 1. Como 3 é maior que 1, descartamos a metade esquerda da lista e continuamos a busca na metade direita:

[1, 3]

O terceiro passo é comparar o número 3 com o elemento do meio da nova lista, que é o próprio número 3. Como eles são iguais, a busca termina com sucesso e retornamos o índice do elemento encontrado, que é 1.