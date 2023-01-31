import  java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner angel = new Scanner(System.in);
        System.out.print("Print your angel A in degrees:  ");
        double a = angel.nextDouble() * (Math.PI/180);
        System.out.print("Print your angel B in degrees:  ");
        double b = angel.nextDouble() * (Math.PI/180);
        double c = 180 - a - b;
        if( a + b > c && a + c > b && b + c > a){
            System.out.println("Triangle exists");
            if(c == 90 || b == 90 || a == 90){
                System.out.println("Triangle rectangular");
            }
        }
        else {
            System.out.println("Triangle not exists");
        }
    }
}
       





