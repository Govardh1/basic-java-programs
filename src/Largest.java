import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number A:");
        int A = input.nextInt();
        System.out.println("enter the number B");
        int B = input.nextInt();
        if(A>B)
        {
            System.out.println(A + " is largest number");
        } else{
            System.out.println(B + " is largest number");
        }

    }
}
