import java.util.Scanner;

public class EqPrimGrau{

    public static void main(String[] args){

        double a;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor do coeficiente a: ");
        a = scanner.nextDouble();

        System.out.printf("Digite o valor do coeficiente b: ");
        double b = scanner.nextDouble();

        if (a == 0){
            System.out.println("Equação sem solução. Coeficiente a deve ser diferente de 0!");
        }
        else{
            double x = -b/a;
            System.out.println("x = " + String.format("%.2f", x));
        }

        scanner.close();
    }
}
