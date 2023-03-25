/* Timelimit: 1
Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive Presentation Error. */

import java.util.Scanner;

public class BeeSimpleProduct {

    public static void main(String[] args) {

        int value1, value2, PROD;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the first value: ");
        value1 = scanner.nextInt();

        System.out.print("Insert the second value: ");
        value2 = scanner.nextInt();

        PROD = value1 * value2;

        System.out.printf("PROD = " + PROD);

        scanner.close();

        /*
         * 
         * import java.util.Scanner;
         * 
         * public class Main {
         * public static void main(String[] args) {
         * Scanner ler = new Scanner(System.in);
         * int A, B;
         * A = ler.nextInt();
         * B = ler.nextInt();
         * System.out.println("PROD = " + (A * B));
         * }
         * }
         */

    }
}