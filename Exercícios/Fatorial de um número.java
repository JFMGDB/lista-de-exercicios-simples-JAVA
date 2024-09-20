import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        
        Scanner read = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite um número inteiro positivo: ");
        numero = read.nextInt();
        
        int fatorial = 1;
        
        while (numero > 1) {
            fatorial = fatorial * numero;
            numero = numero - 1;
        }
        System.out.println("Fatorial é " + fatorial);
    }
}
