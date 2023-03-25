import java.util.Scanner;

public class TrapezioArea {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base MAIOR do trapezio: ");
        double bMaior = scanner.nextDouble();

        System.out.print("Digite o valor da base MENOR do trapezio: ");
        double bMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapezio: ");
        double h = scanner.nextDouble();

        if(bMaior <= 0 && bMenor <= 0 && h <= 0){
            System.out.println("Os valores não podem ser menores ou iguais a 0.");
        }
        else {
            double area = ((bMaior + bMenor) * h )/ 2;
            System.out.println("A área do trapezio e = "+area);
        }

        scanner.close();
        
    }
    
}
