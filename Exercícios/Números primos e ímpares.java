import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = read.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = read.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Números pares entre " + a + " e " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Números ímpares entre " + a + " e " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}