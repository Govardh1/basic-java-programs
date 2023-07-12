import java.util.Scanner;

public class func{
    public static void main(String[] args) {
       System.out.println("the sum is "+sum(10,20));  
    }
    // static int sum(){
    //     Scanner in = new Scanner(System.in);
    //     int num1,num2,sum;
    //     System.out.println("enter the first number");
    //     num1 = in.nextInt();
    //     System.out.println("enetr the second number");
    //     num2 = in.nextInt();
    //     sum=num1+num2;
    //     return sum;
    // }
    static int sum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
}