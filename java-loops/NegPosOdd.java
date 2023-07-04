import java.util.Scanner;

public class NegPosOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the inputs");
        int n= in.nextInt();
        int a=0;
            int b=0;
            int c=0;
        for(int i=0;i<=n;i++)
        {
            
            System.out.println("enter the numbers");
            int inputs=in.nextInt();
            // System.out.println("the ente10red number----> " +inputs);
            if(inputs>0){
                a =a+inputs;
            } else if (inputs<0) {
                b=b+inputs;
            }  if (inputs%2!=0) {
                c=c+inputs;
            } 
        }
        System.out.println("the value of positive numbers is "+a);
        System.out.println("the value of negative numbers is"+b);
        System.out.println("the value of odd numbers is"+c); 
    }
}
