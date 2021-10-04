package Searching;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr={
            {32,43,2},
            {23,54,78},
            {653,543,534}
        };

        int target=11;
        int [] ans=Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] Search(int[][] arr, int target) {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    
    
    
}
