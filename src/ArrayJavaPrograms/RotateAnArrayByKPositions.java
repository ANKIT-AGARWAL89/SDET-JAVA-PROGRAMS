package ArrayJavaPrograms;

import java.util.Arrays;

public class RotateAnArrayByKPositions {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7};
//        int k =4;
//        k = k%(arr.length);
//        reverse(arr,0,k-1);
//        reverse(arr,k,arr.length-1);
//        reverse(arr, 0, arr.length-1);
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//    public static void reverse(int[] arr, int start, int end){
//        while (start<end){
//            arr[start] = arr[start] + arr[end]-(arr[end]=arr[start]);
//            start++;end--;
//        }

        // Approach - 2
        int[] arr = {1,2,3,4,5,6,7};
        int k =4;
        k = k%(arr.length);
        int[] temp = new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int i = k; i<arr.length;i++){
            arr[i-k] = arr[i];
        }
        for (int i =0;i<temp.length;i++){
            arr[arr.length-k+i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
