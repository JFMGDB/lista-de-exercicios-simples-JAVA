import java.util.Scanner;

public class Main {
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
      double salarioBruto;
      double iprf;

      System.out.println("Digite seu salario bruto:");
      salarioBruto = read.nextDouble();

      if(salarioBruto <= 1903.98) {
          
          iprf = 0.0;
      }
      else if(salarioBruto <=2826.65) {
          
          iprf =  (salarioBruto - 1903.98) * 0.075;
      }
      else if(salarioBruto <= 3751.05) {
          
          iprf = (salarioBruto - 2826.65) * 0.15 + 69.20;
      }
      else if(salarioBruto <= 4664.68) {
          
          iprf = (salarioBruto - 3751.05) * 0.225 + 207.86;
      }
      else{

          iprf = (salarioBruto - 4664.68) * 0.275 + 413.43;

      }

        System.out.println("Sua contribuicao em impostos do IPRF em R$ é: " + iprf);
   }
}