package Searching;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr={1,434,2,-33,22};
        System.out.println(Min(arr));
    }

    static int Min(int arr[]){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
