import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.log((x * y));
        System.out.println(z);
    }
}