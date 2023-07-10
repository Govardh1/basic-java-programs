import java.util.Scanner;
public class Ninp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int numbers=1;
        int sum=0;
        while(numbers!=0)
        {
            System.out.println("enter the numbers:::::::");
            numbers =n.nextInt();
            sum=sum+numbers;
        }
        System.out.println(sum+"is the sum");
    }
}
