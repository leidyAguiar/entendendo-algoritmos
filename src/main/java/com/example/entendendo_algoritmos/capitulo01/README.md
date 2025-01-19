### Definição:
O capítulo 1 aborda pesquisa binária e pesquisa simples(sequencial) e mostra como um algoritmo pode acelerar o seu código.

[Pesquisa Simples] Este algoritmo percorre o array que contém os dados da primeira até a última posição.
- A necessidade de percorrer todo o array.

O(n) - [Tempo de execução - Pesquisa Simples] Na pesquisa simples, a primeira abordagem seria verificar número por numero. Se fosse uma lista de 128 números, precisaríamos de 128 tentativas no pior dos casos, ou seja, se o número for o último da lista.
O número máximo de tentativas é igual ao tamanho da lista. Isso é chamado de **tempo linear**.

O(log n) - [Tempo de execução - Pesquisa Binária] Na pesquisa binária se a lista tem 128 números, precisa-se de, no máximo, sete tentativas no pior dos casos, ou seja, se o elemento estiver no final da lista.
A pesquisa binária é executada com **tempo logarítmico**.

**Logaritmos - Exemplos**

2⁷ = 128 <---> log₂128 = 7

2⁷ = 2 elevado a 7 potência = 128

Exemplo: Pesquisa Simples

```java
public class PesquisaSimples {
    public static void main(String[] args) {

            // índice  0, 1, 2, 3, 4
        int[] lista = {1, 3, 5, 7, 9};

        System.out.println(buscaSequencial(lista, 5));
        System.out.println(buscaSequencial(lista, 9));
        System.out.println(buscaSequencial(lista, 2));
    }

    public static int buscaSequencial(int[] array, int elemento) {
        // Itera sobre a lista para buscar o elemento no índice.
        // array.length = 5
        // array.length - 1 = 4
        for (int i = 0; i <= array.length - 1; i++) {
            if (elemento == array[i]) // Para cada iteração do array, compara se a o elemento é igual a posição atual
                return i; // Se os valores são iguais, a busca termina
        }
        return -1; // Se o elemento não existir na lista, retorna -1 (Não encontrado)
    }
}
```

[Pesquisa Binária] Só funciona quando a sua lista está ordenada.

- O(log n) [Pesquisa Binária] - também conhecido como ***tempo logarítmico***.
- O(n) [Pesquisa Simples] - conhecido como ***tempo linear***.
- O(log n) é mais rápido do que O(n), e O(log n) fica ainda mais rápido conforme a lista aumenta.

Quando você procura um elemento usando a pesquisa simples, no pior dos casos, terá de analisar elemento por elemento, passando por todos.
Por exemplo, se for uma lista de 16 elementos, precisa checar no máximo os 16 números.
Na pesquisa binária, precisa verificar log n elementos no pior dos casos.
Para uma lista de 16 elementos, log₂16 = 4, porque 2 elevado a 4 é igual a 16. Para essa lista, precisaria passar por, no máximo, 4 tentativas.

Exemplo: Pesquisa Binária
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
        int fim = lista.length - 1; // Fim recebe (tamanho da lista - 1), ou seja, 5 - 1 = 4 (índice do último elemento do array)
        int meio, chute; // meio é o índice central e chute é o valor do elemento a ser encontrado

        while (inicio <= fim) { // Enquanto existir elementos a serem procurados na lista
            meio = (inicio + fim) / 2; // Calcula o índice central, ou seja, índice => 2 = (0 + 4) / 2
            chute = lista[meio]; // Elemento no índice central, ou seja, elemento(chute) = 5
            if (chute == elemento) // Comparando o elemento do meio com o elemento a ser encontrado
                return meio; // Se forem iguais, retorna o índice do meio
            if (chute > elemento) // Se o elemento central for maior que elemento procurado
                fim = meio - 1; // Ajusta o fim para buscar na metade à esquerda
            else // Se o elemento do meio for menor que o elemento buscado
                inicio = meio + 1; // Ajusta o início para buscar na metade à direita
        }
        return -1; // Se os limites se cruzarem e elemento não existir na lista
    }
}
```

Para ilustrar esse algoritmo, vamos usar um exemplo simples. Suponha que temos uma lista de números ordenados listados abaixo e queremos encontrar o número 3. A lista é a seguinte:

[1, 3, 5, 7, 9]

```java
int[] lista = {1, 3, 5, 7, 9};
int elemento = 3;
int inicio = 0;
int fim = lista.length - 1;
int meio = (inicio + fim) / 2;
int chute = lista[meio];

if (chute == elemento)
    return meio; // Se 5 == 3, false
if (chute > elemento) // 5 > 3, true
    fim = meio - 1; // Como 5 é maior que 3, descarta a metade direita
else (chute < elemento)
    inicio = meio + 1;

```

O primeiro passo é comparar o número 3 com o elemento do meio da lista, que é o número 5. Como 3 é menor que 5, descartamos a metade direita da lista e continuamos a busca na metade esquerda:

Nova lista: [1, 3]

```java
int meio = (inicio + fim) / 2;
int chute = lista[meio];

if (chute == elemento)
    return meio; // Se 1 == 3, false
if (chute > elemento) // 1 > 3, false
    fim = meio - 1;
else (chute < elemento) // Como 3 é maior que 1, descarta a metade esquerda
    inicio = meio + 1;
```

O segundo passo é comparar o número 3 com o elemento do meio da nova lista, que é o número 1. Como 3 é maior que 1, descartamos a metade esquerda da lista e continuamos a busca na metade direita:

índice: 0, 1
Nova lista: [1, 3]

```java
int meio = (inicio + fim) / 2;
int chute = lista[meio];

if (chute == elemento)
// Encontramos 3 no índice 1
return meio;

if (chute == elemento) // Se 3 == 3
    return meio; // Encontramos 3 no índice 1
if (chute > elemento)
    fim = meio - 1;
else (chute < elemento)
    inicio = meio + 1;
```

O terceiro passo é comparar o número 3 com o elemento do meio da nova lista, que é o próprio número 3. Como eles são iguais, a busca termina com sucesso e retornamos o índice do elemento encontrado, que é 1.

Bibliografia:

Aditya, Y. Bhargava. Título: Entendendo Algoritmos: Um guia ilustrado para programadores e outros curiosos. Primeira Edição. Brasil, publicação traduzida em português: Editora Novatec, abril 2017.

Disponível em:

[![Amazon](https://img.shields.io/badge/amazon-52b5f7?style=for-the-badge&logo=amazon&logoColor=white)](https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634)