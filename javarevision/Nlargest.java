import java.util.Scanner;

public class Nlargest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number=1;
        int large=Integer.MIN_VALUE;
        while(number !=0){
            number=input.nextInt();
        if(number==0)
            {break;}
        if(number>large){
            large=number;
        }
    } 
     System.out.print("the largerst number is"+large);  
}
}
 

