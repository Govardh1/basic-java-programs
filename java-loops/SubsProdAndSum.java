import java.util.Scanner;

public class SubsProdAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number::");
        int number = in.nextInt();
        int res;
        int a=0;
        int b=1;
        int c=0;
        while(number!=0)
                {
                res = number%10;
                number = number / 10;
                a = a + res;
                System.out.println("the additon is "+a);
                b = b * res; 
                System.out.println("the product is "+b);
                }
                c=b-a;
        System.out.println("the substraction of a product and sum is " + c);
    }
}


