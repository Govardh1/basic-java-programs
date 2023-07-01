import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner intreste =new Scanner(System.in);
        System.out.println("enter the principle amount");
        int principle = intreste.nextInt();
        System.out.println("enter the time taken");
        int time = intreste.nextInt();
        System.out.println("enter the rate of intrest");
        int rate = intreste.nextInt();
        int simpleintrest=(principle*rate*time)/100;
        System.out.println("the simple intrest is " + simpleintrest);
    }
}
