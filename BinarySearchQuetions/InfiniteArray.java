package BinarySearchQuetions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(InfiniteSearch(arr, target));

    }
    static int InfiniteSearch(int[] arr,int target){
        //first find the range
        //first start of box sixe 2
        int start =0;
        int end=1;

        //condtion for the target to lie in the range
        while(target>arr[end]){
            int tempStart =end+1;
            //doulbe the range
            //end=prev + size of box *2
             end=end+ (end-start+1)*2;
             start=tempStart;
        }
        return BinarySearch(arr,target,start,end);

    }
    static int BinarySearch(int[] arr,int target,int start,int end){
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start =mid+1;
        }
        else if(target==arr[mid]) {
            //element found
            return mid;
        }
    }
    return -1;
}
    
}
