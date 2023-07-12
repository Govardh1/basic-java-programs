public class MaxMin {
    public static void main(String[] args) {
       int largest=MAX(10,20,30); 
       int smallest=MIN(20,30,40);
       System.out.println(largest);
       System.out.println(smallest);
    }
    static int MAX(int a, int b, int c)
    {
        int largest=a;
        if(b>largest)
        {
            largest=b;
        }
        if(c>largest)
        {
            largest=c;
        }
         return largest;
    }
    static int MIN(int a , int b ,int c){
        int smallest=c;
        if(b<smallest)
        {
            smallest=b;
        }
        if(a<smallest)
        {
            smallest=a;
        }
        return smallest;
    }
}
