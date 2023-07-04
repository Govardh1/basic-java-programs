import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a::");
        int a = in.nextInt();
        System.out.println("enter the value of b::");
        int b = in.nextInt();
        int c = (int)(Math.pow(a, b));
        System.out.println(" the value of c is::"+c);
    }
}
