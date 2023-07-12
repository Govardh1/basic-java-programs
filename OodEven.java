import java.util.Scanner;
public class OodEven {
    public static void main(String[] args) {
    //    int a= oddeven();

       System.out.println(oddeven()+ " is function call in odd or even ");
              System.out.println(oddeven()+ " is function call in odd or even ");
       System.out.println(oddeven()+ " is function call in odd or even ");
       System.out.println(oddeven()+ " is function call in odd or even ");
       System.out.println(oddeven()+ " is function call in odd or even ");
       System.out.println(oddeven()+ " is function call in odd or even ");
       System.out.println(oddeven()+ " is function call in odd or even ");

    }
    
    static int oddeven(){
        Scanner in=new Scanner(System.in);
        System.out.println("enetr the number");
        int num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("is even number");
          return num;  
        }else
        {
            System.out.println("is odd number");
            return num;
        }
        
    }
}
