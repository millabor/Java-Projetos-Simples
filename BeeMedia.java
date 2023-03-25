import java.io.IOException;
import java.util.Scanner;

public class BeeMedia {
	
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));

        scanner.close();
    }
	
}