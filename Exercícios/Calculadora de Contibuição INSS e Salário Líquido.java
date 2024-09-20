import java.util.Scanner;

public class Main {
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
      double salarioBruto;
      double inss;

      System.out.println("Digite seu salario bruto:");
      salarioBruto = read.nextDouble();

      if(salarioBruto <= 1320.00) {
          
        inss = salarioBruto * 0.075;
      }
      else if(salarioBruto <=2571.29) {
          
        inss =  (1320.00 * 0.075) + ((salarioBruto - 1320.00) * 0.09) ;
      }
      else if(salarioBruto <= 3856.94) {
          
        inss = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((salarioBruto - 2571.29) * 0.12);
      }
      else if(salarioBruto <= 7507.49) {
          
        inss = (1320.00 * 0.075) + ((2571.29 - 1320.00) * 0.09) + ((3856.94 - 2571.29) * 0.12) + ((salarioBruto - 3856.94) * 0.14);
      }
      else{

        inss= 877.24;
      }

        double salarioLiquido = salarioBruto - inss;

        System.out.println("Sua contribuicao para o INSS em R$ é: " + inss);
        System.out.println("Seu salario liquido em R$ é: " + salarioLiquido);
   }
}
