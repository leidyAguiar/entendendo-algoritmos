### Definição:

Recursividade é um conceito fundamental na programação e matemática, onde uma função chama a si mesma diretamente ou indiretamente para resolver um problema.

Função recursiva: uma função é dita recursiva se, durante a execução, ela chama a si mesma.

- Quando você escreve uma função recursiva, deve informar quando a recursão deve parar. É por isso que toda função recursiva tem duas partes:
- o **caso-base** e o **caso recursivo**.
  - O **caso-base** é quando a função não chama a si mesma novamente, de forma que o programa não se torna um loop infinito, precisa ter um critério de parada.
  - O **caso recursivo** é quando a função chama a si mesma.

```java
public class ContagemRegressiva {
    public static void main(String[] args) {
        contagem(5);
    }

    public static void contagem(int num) {
        System.out.println(num);

        if (num <= 1) // caso-base, critério de parada
            return;
        else // caso-recursivo
            contagem(num - 1);
    }
}
```
Se [num <= 1] **terminou (caso-base);** -> É a condição que interrompe a recursão. Sem o caso-base apropriado, a função recursiva continuará chamando a si mesma levando a um loop infinito ou a um erro de stack overflow.

caso contrário, executa a contagem com [contagem(num - 1)] **(caso recursivo)];** -> É a parte da função que inclui uma ou mais chamadas para a própria função, mas com argumentos que se aproximam do caso-base.
Cada chamada recursiva deve alterar os argumentos de tal forma que eles se aproximem do caso-base.

Exemplo: Fatorial
O **fatorial** de um número natural N é a multiplicação de 1 até N, exceto para o valor 0(zero), cujo fatorial por definição é 1.

fatorial(0) = 1

fatorial(1) = 1 => fatorial(1) = 1 * fatorial(0)

fatorial(2) = 1 * 2 = 2 => fatorial(2) = 2 * fatorial(1)

fatorial(3) = 1 * 2 * 3 = 6 => fatorial(3) = 3 * fatorial(2)

fatorial(4) = 1 * 2 * 3 * 4 = 24 => fatorial(4) = 4 * fatorial(3)

fatorial 0 = 1;

fatorial n = n * fatorial(n - 1)

```java
public class Fatorial {
  public static void main(String[] args) {
    System.out.println(fatorial(5));
  }

  public static int fatorial(int n) {
    if (n == 0) // caso-base
      return 1;
    else // caso-recursivo
      return n * fatorial(n - 1);
  }
}
```
Recapitulando

- Recursão é quando uma função chama a si mesma.
- Toda função recursiva tem dois casos: o caso-base e o caso recursivo.

Bibliografia:

Aditya, Y. Bhargava. Título: Entendendo Algoritmos: Um guia ilustrado para programadores e outros curiosos. Primeira Edição. Brasil, publicação traduzida em português: Editora Novatec, abril 2017.

Disponível em:

[![Amazon](https://img.shields.io/badge/amazon-52b5f7?style=for-the-badge&logo=amazon&logoColor=white)](https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634)