package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        // int[] arr;
        // arr=new int[5];
        // for (int i=0; i<arr.length; i++){
        //     arr[i]=in.nextInt();
        // }
        // for(int num:arr){//for each loop
        //     System.out.print(num+" ");
        // }
        // System.out.println(Arrays.toString(arr));

        String[] str=new String[4];
        for (int i=0; i<str.length; i++){
            str[i]=in.next();
        }
        for(String string:str){
            System.out.println(Arrays.toString(str));


        }

    }
    
}
