import java.util.Scanner;

public class Areacircle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius of circle:");
        int r =in.nextInt();
        int area=0;
        area=(int)3.141f*r*r;
        System.out.print("area of circle is ::"+area);
    }
}