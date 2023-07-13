public class seventhp {
    public static void main(String[] args) {
        pattren(5);
    }
    static void pattren(int n)
    {
        for (int row=1;row<=n;row++)
        {
            int spaces=n-row;
            for(int space=0;space<=spaces;space++){
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
