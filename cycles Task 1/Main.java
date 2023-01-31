import  java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Print your number: ");
        int x = scanner.nextInt();
        if(x < 0){
            System.out.println("Error number");
        }
        else{
            int summa = 0;
          for(int i = 1; i <= x; i++)
              summa = summa + x;
        }


    }
}
       





