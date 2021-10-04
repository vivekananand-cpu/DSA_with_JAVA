package BinarySearchQuetions;

import java.util.Arrays;

public class CeilingOfNo {
    //first and last occurrence of a number 
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,3,55};
        int[] ans=Ceiling(arr,2);
        System.out.println(Arrays.toString(ans));
        
       

    }

    static int[] Ceiling(int[] arr, int target){
        int[] ans={-1,-1};
        //check for first occurrence
        int start=search(arr,target,true);
        //check for last occurrence
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;



        
}
//this function retuns the index value of the element
     static int  search(int[] arr,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start =mid+1;
        }
        else if(target==arr[mid]) {
            //potential ans found
            ans=mid;
            if(findStartIndex){
                end=mid-1;
            }else{
                start=mid+1;

            }
        }
    }
    return ans;
    }
    
}



//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