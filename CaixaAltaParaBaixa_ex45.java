
/* Fac¸a um programa para converter uma letra maiuscula em letra min ´ uscula. Use a tabela ´
ASCII para resolver o problema. */
import java.util.Scanner;

public class CaixaAltaParaBaixa_ex45 {

    public static void main(String[] args) {

        String maiuscula;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra MAIUSCULA: ");
        maiuscula = scanner.next().toLowerCase();

        System.out.println(maiuscula);

        scanner.close();

    }

}
