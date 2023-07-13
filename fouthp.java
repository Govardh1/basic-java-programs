public class fouthp {
    public static void main(String[] args) {
        pattren(5);

    }static void pattren(int n)
    {
        for (int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
