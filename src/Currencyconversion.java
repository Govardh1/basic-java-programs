import java.util.Scanner;

public class Currencyconversion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // System.out.println("enter the rupees");
        // float rupees= input.nextFloat();
        // float dollors=rupees/82.10f;
        // System.out.println("The rupeers to dollors conversion is " + dollors);
        System.out.println("enter the string ");
        String name=input.nextLine();
                int length = name.length();
                // boolean isname=true;

        {
            for(int i=0;i<=length/2;i++)
            {
                // int n;
                if(name.charAt(i)==name.charAt(length-1-i))
                { 
                    System.out.println("is plaindrome");
                    break;
                }
            }
                
                    System.out.println("is not plaindorme");// isname =false;
                
                
            
            // if(isname){
                
            //     }
            
        }
    }
}
