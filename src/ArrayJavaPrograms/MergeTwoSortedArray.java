package ArrayJavaPrograms;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] merged = new int[a.length+b.length];
        int i=0,j=0,index=0;
        while (i<a.length && j<b.length){
            if (a[i]>b[j]){
                merged[index++] = b[j++];
            } else  {
                merged[index++] = a[i++];
            }
        }
        while (i<a.length){
            merged[index++] = a[i++];
        }
        while (j<b.length){
            merged[index++] = b[j++];
        }
        System.out.println(Arrays.toString(merged));
    }
}
