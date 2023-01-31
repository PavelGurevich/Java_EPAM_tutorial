import  java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose number: ");
        int x = scanner.nextInt();
        if (x > 3) {
            double y = 1 / (Math.pow(x, 3) + 6);
            System.out.println(y);
        } else {
            double y = Math.pow(x, 2) - 3 * x + 9;
            System.out.println(y);
        }

    }
}
       





