# Tabuada de um número

 - Peça ao usuário para inserir um número inteiro e exiba a tabuada desse número de 1 a 10.
   
**Resolução:**

<details>
  <summary>Spoiler warning</summary>

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número inteiro: ");
        numero = read.nextInt();

        int i = 1;
        
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i = i + 1;
        }
    }
} 

```
</details>
