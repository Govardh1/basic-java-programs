import java.util.Scanner;

public class AgeVote {
    public static void main(String[] args) {
        
      int age = elegibility(20);
      int vote=elegibility(age);
      int naa=elegibility(age);
      int baa=elegibility(age);
      int jaa=elegibility(age);

    }
    static int elegibility(int num){
        Scanner in = new Scanner(System.in);
        System.out.println( "eneter the age");
        int age=in.nextInt();
       if(num>18)
       {
        System.out.println(num+"is elegible");
       } else
       {
        System.out.println(num+"is not elegible");
       }

        return num;
    }
}
