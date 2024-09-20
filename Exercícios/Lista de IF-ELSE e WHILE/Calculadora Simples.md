# Calculadora Simples

 - Escreva um programa que peça ao usuário dois números inteiros e exiba a soma, subtração, multiplicação e divisão (caso o denominador não seja zero).

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```
import java.util.Scanner;

public class Main {
  public static Scanner read = new Scanner(System.in);

  public static void main(String[] args) {
    int num1;
    int num2;

    System.out.println("Digite o primeiro numero");
    num1 = read.nextInt();

    System.out.println("Digite o segundo numero");
    num2 = read.nextInt();

    int soma = num1 + num2;
    System.out.println("A soma dos numeros é: " + soma);

    int subtracao = num1 - num2;
    System.out.println("A subtração dos numeros é: " + subtracao);

    int multiplicacao = num1 * num2;
    System.out.println("A multiplicação dos numeros é: " + multiplicacao);

    if (num2 == 0) {
      System.out.println("Não é possivel dividir pois o denominador é 0");
    } else {
      int divisao = num1 / num2;
      System.out.println("A divisão dos numeros é: " + divisao);
    }

  }
}
```
</details>

* * *
