public class linear {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90
        };
       int target=20;
       if(arr.length==0){
            System.out.println(-1);
        }else
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            System.out.println(i+" ");
            break;
        }
    }    
    }
    }

