import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double z = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/ 2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println(z);
    }
}