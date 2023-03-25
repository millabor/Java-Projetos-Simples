/* Receba o salario-base de um funcion ´ ario. Calcule e imprima o sal ´ ario a receber, sabendo- ´
se que esse funcionario tem uma gratificac¸ ´ ao de 5% sobre o sal ˜ ario-base. Al ´ em disso, ´
ele paga 7% de imposto sobre o salario-base. */

import java.util.Scanner;

public class SalarioBae_ex42 {

    public static void main(String[] args) {

        double salariobase, total;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu salário-base: ");
        salariobase = scanner.nextDouble();

        total = salariobase - (salariobase * 0.07) + (salariobase * 0.05);

        System.out.print("O valor que será recebido é R$" + String.format("%.2f",total));

        scanner.close();

    }

}
