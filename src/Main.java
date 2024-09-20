import java.util.Scanner;

public class Main {
    public static int QTD_VALORES = 10;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double[] valores = new double[QTD_VALORES];
        for (int i = 0; i < QTD_VALORES; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            valores[i] = ler.nextDouble();
        }

        if (estaOrdenado(valores)) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }
    }

    public static boolean estaOrdenado(double[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
            if (valores[i] > valores[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
