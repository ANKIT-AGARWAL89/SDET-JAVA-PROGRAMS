package SearchingAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // for binary search - array should be sorted
        // TC - O(logn)
        int[] arr = {4, 5, 1, 6, 3, 2, 7};
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        int mid;
        int target = 6;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("index at : " + mid);
                break;
            } else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
    }
}
