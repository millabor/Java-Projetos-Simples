import java.lang.Math;
import java.util.Scanner;

public class EqSegGrau{
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor do coeficiente c: ");
        double c = scanner.nextDouble();

        if(a == 0){
            System.out.println("Não e uma equação de segundo grau.");
        }
        else {
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta > 0){
                System.out.println("Delta deve ser maior que zero");
            } 

            else {
                 
                double x1 = (-b - Math.sqrt(delta)) / 2 * a;
                double x2 = ( - b + Math.sqrt(delta)) / 2 * a;
                System.out.println("Os resultados dá equação são x1 = " + x1 + " e x2 = "+x2);
            }
        }

        scanner.close();

    }
}
