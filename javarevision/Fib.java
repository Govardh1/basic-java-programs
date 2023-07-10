import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the num:");
        int number =in.nextInt();
        int fi=0;
        int sec=1;
        int num=0;
        for(int i = 2;i<=number;i++)
        {
            num=fi+sec;
            System.out.println("the num is ::"+num);
            fi=sec;
            System.out.println("the fi is ::"+fi);
            sec=num;
            System.out.println("the sec is ::"+sec);
        }
        System.out.print("the num is ::"+num);
    }
}
