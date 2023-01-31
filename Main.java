
import  java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Print your time in second: ");
        int time_sec = time.nextInt();
        var time_hours = time_sec / 3600;
        var times_minutes = time_sec / 60;
        System.out.println(String.format("%d hours. %d minutes. %d seconds",time_hours,times_minutes,time_sec));
    }
}
       





