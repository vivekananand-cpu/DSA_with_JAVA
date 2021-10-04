package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,45,545,22,34,4};
        int target=34;
        
        System.out.println( searchInRange(arr, target,1,4));

    }
    static int LinearSearch(int[] arr,int taget){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==taget){
                return i;
            }
        }
        return -1;
        

    }

    static boolean searchInRange( int[] arr,int target,int start,int end ){
        if(arr.length==0){
            return false;

        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
    
}
