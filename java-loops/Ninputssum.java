import java.util.Scanner;

public class Ninputssum {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
        int sum=0;
        while(number!=0)
        {
            System.out.println("enter 0 to exit");
            number = in.nextInt();
            sum=sum+number;
        }
        System.out.println(+sum);
        
    }
}
