package Arrays;

public class MaxINArr {
    public static void main(String[] args) {
        int[] arr={1,323,445,22,4};
        System.out.println(Max(arr));
        

    }
    static int Max(int[] arr){
        int max=arr[0];
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
