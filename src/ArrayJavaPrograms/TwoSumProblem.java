package ArrayJavaPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 5, 3, 1, 6};

        // HashMap Approcah
        int target = 5;
        Boolean found = false;
        HashMap<Integer, Integer> map = new HashMap<>(); // map <element, index>
        for (int i = 0; i < arr.length; i++) {
            int component = target - arr[i];
            if (map.containsKey(component)) {
                System.out.println(arr[i] + " + " + component + " = " + target);
                found = true;
            } else
                map.put(arr[i], i);
        }
        if (!found){
            System.out.println("Not Found");
        }


        // 2 Pointer approach -

//        Arrays.sort(arr);
//        int target = 5;
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            if (arr[start] + arr[end] == target) {
//                System.out.println("True");
//                break;
//            }
//            else if (arr[start] + arr[end] < target)
//                start++;
//            else
//                end--;
//        }
    }
}
