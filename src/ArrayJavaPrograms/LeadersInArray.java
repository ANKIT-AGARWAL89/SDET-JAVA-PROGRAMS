package ArrayJavaPrograms;


import java.util.HashSet;

import java.util.Set;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 7, 5, 3, 2};
        Set<Integer> leaders = new HashSet<>();
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                leaders.add(max);
            }
        }
        System.out.println(leaders);
    }
}
