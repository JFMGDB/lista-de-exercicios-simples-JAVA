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
