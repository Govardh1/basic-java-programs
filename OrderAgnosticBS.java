public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={99,90,89,48,38,22,21,20,19,18,16,9,6,3,1};
        int target=99;
        int ans= orderagnostibs(arr,target);
        System.out.println(ans);
    }
    static int orderagnostibs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==target){return mid;}
      if(isAsc){
        if(target<arr[mid]){
        end=mid-1;
      }else {
        start=mid+1;
      } 
    }
      else
      {
        if(target>arr[mid]){
        end=mid-1;
      }else {
        start=mid+1;
      }
      }
    }

      return -1;
    }
}




