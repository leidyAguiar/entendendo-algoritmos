### Definição:
O capítulo 2 aborda arrays e listas encadeadas - dois tipos de estrutura básica e explica seus prós e contras de ambas as estruturas para que possa decidir qual é a ideal para o seu algorítmo.

[Ordenação por Seleção] Consiste na tarefa de organizar um conjunto de dados ou uma coleção (ex: array), seguindo uma determinada ordem predefinida.

- O algoritmo tem uma complexidade de tempo de O(n x n) ou O(n^2), onde n é o número de elementos na lista. Isso ocorre porque, para cada elemento, o algoritmo percorre a lista restante para encontrar o menor elemento.

A seguir está uma explicação detalhada do funcionamento do algoritmo para uma lista de inteiros:


A ordenação por seleção é um algoritmo bom, mas não é muito rápido.

```java
public class OrdenacaoPorSelecao {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(ordenacaoPorSelecao(lista)); // [2, 3, 5, 6, 10]
    }

    // Recebe uma lista de inteiros como parâmetro.
    public static List<Integer> ordenacaoPorSelecao(List<Integer> arr){
        // Cria uma nova lista vazia para armazenar os elementos ordenados.
        List<Integer> novoArr = new ArrayList<>(arr.size());
        int size = arr.size(); // Armazena o tamanho original da lista.
        for (int i = 0; i < size; i++) { // Itera sobre a lista original
            int menor = buscarMenor(arr); // Encontra o menor elemento a cada iteração
            novoArr.add(arr.remove(menor)); // Remove o menor elemento da lista original e adiciona esse elemento à nova lista
        }
        return novoArr; // Retorna a nova lista ordenada.
    }

    // Recebe uma lista de inteiros como parâmetro
    public static int buscarMenor(List<Integer> array) {
        int menor = array.get(0); // Inicializa o menor elemento como o primeiro da lista.
        int menor_indice = 0; // Inicializa o índice do menor elemento como 0.

        // Itera sobre a lista para encontrar o menor elemento e seu índice.
        for (int i = 1; i < array.size(); i++) {
            int elemento = array.get(i); // Obtém o elemento atual da lista.

            if (elemento < menor){ // Compara o elemento atual com o menor elemento encontrado.
                menor = array.get(i); // Atualiza o menor elemento.
                menor_indice = i; // Atualiza o índice do menor elemento.
            }
        }
        return menor_indice; // Retorna o índice do menor elemento encontrado.
    }
}
```

```java
public class OrdenacaoPorSelecao2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10}; // Cria um array de inteiros
        ordenacaoPorSelecao(arr); // Chama o método de ordenação por seleção
        System.out.println(Arrays.toString(arr));  // Imprime o array ordenado
    }

    public static void ordenacaoPorSelecao(int[] array) {
        int i, menor, j, aux;
        // Loop externo que percorre cada elemento do array
        for (i = 0; i < array.length; i++) {
            menor = i; // Inicializa a variável 'menor' com o índice atual
            
            // Loop interno que percorre os elementos subsequentes ao índice atual
            for (j = i + 1; j < array.length; j++) {
                // Verifica se o elemento atual é menor que o elemento no índice 'menor'
                if (array[j] < array[menor]) {
                    // Se for, troca os elementos de posição
                    aux = array[j];
                    array[j] = array[menor];
                    array[menor] = aux;
                }
            }
        }
    }
}
```

Bibliografia:

Aditya, Y. Bhargava. Título: Entendendo Algoritmos: Um guia ilustrado para programadores e outros curiosos. Primeira Edição. Brasil, publicação traduzida em português: Editora Novatec, abril 2017.

Disponível em:

[![Amazon](https://img.shields.io/badge/amazon-52b5f7?style=for-the-badge&logo=amazon&logoColor=white)](https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634)