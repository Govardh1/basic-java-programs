public class Linearone {
    public static void main(String[] args) {
        int[] nums={21,20,30,563,98,4,9876,1298,282};
        int target=98;
        int ans=linearsearch(nums, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
