import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the string to check the palindrome::");

        String name= in.next();

        for(int i=0;i<=name.length()-1;i++){

            if(name.charAt(0)==name.charAt(name.length()-1))

            {

            System.out.println("this is palindrome");

            break;

            }

        else

        {

            System.out.println("this is not a palindrome");

            break;
            
            }
        }
    }
}
