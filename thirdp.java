public class thirdp {
    public static void main(String[] args) {
        pattren(10);
    }
    static void pattren(int n)
    {
        for (int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
