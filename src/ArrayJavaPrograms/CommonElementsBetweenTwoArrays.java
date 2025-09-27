package ArrayJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 6, 1};
        int[] arr2 = {5, 0, 6, 8};
        Set<Integer> commonset = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int x : arr1) {
            set1.add(x);
        }
        for (int x : arr2) {
            if (set1.contains(x)) {
                commonset.add(x);
            }
        }
        System.out.println(commonset);
    }
}
