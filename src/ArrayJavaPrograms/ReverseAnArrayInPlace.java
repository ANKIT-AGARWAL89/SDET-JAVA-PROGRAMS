package ArrayJavaPrograms;

import com.sun.source.tree.WhileLoopTree;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            arr[start] = arr[start] + arr[end] - (arr[end] = arr[start]);
            start++;
            end--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
