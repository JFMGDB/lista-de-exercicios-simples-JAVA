# Calculadora de IMC

- Peça ao usuário que insira seu peso (em kg) e altura (em metros). Calcule e exiba o Índice de Massa Corporal (IMC). Depois, com base no valor do IMC, informe ao usuário se ele está abaixo do peso, peso normal, sobrepeso ou obeso.

**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```
import java.util.Scanner;

public class Main {
  public static Scanner read = new Scanner(System.in);
  
  public static void main(String[] args) {
    double peso;
    double altura;
    
    System.out.println("Digite o seu peso (em kg e com .):");
    peso = read.nextDouble();
    
    System.out.println("Digite a sua altura (em metros e com .):");
    altura = read.nextDouble();
    
    double imc = peso / (altura * altura);
      System.out.println("Seu IMC é: " + imc);
    
      if (imc < 18.5) {
        System.out.println("Voce esta abaixo do peso");
      }
      else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Voce esta com o peso normal"); 
      }
      else if (imc >= 25 && imc <= 29.9) {
        System.out.println("Voce esta com sobrepeso");
      }
      else {
      System.out.println("Voce esta obeso");
      }
  }
}
```
</details>

* * *
