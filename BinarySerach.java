public class BinarySerach {
    public static void main(String[] args) {
        int[] arr={2,3,4,12,13,14,16,18,19,20,23};
        int target=23;
        int ans=binaryser(arr,target);
        System.out.println(ans);
    }
    static int binaryser(int[] arr,int target){
        int start=0;int end=arr.length-1;
        while(start<=end){
      //      int mid=(start+end)/2;
      int mid=start+(end-start)/2;
      if(target<arr[mid]){
        end=mid-1;
      }else if(target>arr[mid]){
        start=mid+1;
      }else{
        return mid;
    }
      }
      return -1;
}
}
