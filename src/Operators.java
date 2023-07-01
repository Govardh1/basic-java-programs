import java.util.Scanner;

public class Operators {
   public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("eneter the first number");
        int num1 = number.nextInt();
        System.out.println("enter the second number");
        int num2 = number.nextInt();
        double num3 ;
        num3= num1 + num2;
        System.out.println("the operator is (+,-,*,/):");
        char operator = number.next().charAt(0);
        if(operator== '+' )
        {
            num3=num2+num1;
            System.out.println("the additon is:" +num3);
        }else if (operator == '-'){
            num3=num1+num2;
            System.out.println("the substraction is:" +num3);
        }
        else if (operator == '*'){
            num3=num1*num2;
            System.out.println("the multiplication is:" +num3);
        }
        else if (operator == '/'){
            num3=num1/num2;
            System.out.println("the division is:" +num3);
        } 
        }
   } 
}

