public class Fifthp {
    public static void main(String[] args) {
        pattren(5);
    }
    static void pattren(int n)
    {
        for (int row=1;row<=n*2-1;row++)
        {
            int totalcolsinrow= row>n ? 2*n-row:row;
            for(int col=1;col<=totalcolsinrow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
