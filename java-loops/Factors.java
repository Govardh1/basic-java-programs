import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number::");
        int n = in.nextInt();
        System.out.println("enter the number to know its factors");
        int number = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(number%i==0){
            System.out.println("print the factors::" +i);
            }
        }
    }
}
