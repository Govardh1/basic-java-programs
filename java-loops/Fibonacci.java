import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n");
        int n=in.nextInt();
        System.out.println("enter the numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int fij=0;
        for(int i=2;i<=n;i++){
            fij=a+b;
            a=b;
            b=fij;
            System.out.println("the fibonacci number is" +fij);
        }
        // System.out.println(fij);
    }
}