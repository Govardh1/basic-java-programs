public class sisxthp {
    public static void main(String[] args) {
        pattren(5);
    }
    static void pattren(int n)
    {
        for (int row=1;row<2*n;row++)
        {
            int tcol=row>n?2*n-row:row;
            int spaces=n-tcol;
            for(int space=0;space<spaces;space++)
            {
                System.out.print(" ");
            }
            
            for(int col=1;col<=tcol;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
