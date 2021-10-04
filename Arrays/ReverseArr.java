package Arrays;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Reverse(arr);
        
    }

    static void Reverse(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
            swap(array,start,end);
            start++;
            end--;

        }
        System.out.println(Arrays.toString(array));
        
    }
    static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        

    }
    
}
