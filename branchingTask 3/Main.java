import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print x1 and y1 dot A: ");
        int x1 = scanner.nextInt();;
        int y1 = scanner.nextInt();
        System.out.print("Print x2 and y2 dot B: ");
        int x2 = scanner.nextInt();;
        int y2 = scanner.nextInt();
        System.out.print("Print x3 and y3 dot C: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        if((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)){
            System.out.println("Они расположены на одной прямой");
        }else {
            System.out.println("Они  не расположены на одной прямой");
        }
    }

}
