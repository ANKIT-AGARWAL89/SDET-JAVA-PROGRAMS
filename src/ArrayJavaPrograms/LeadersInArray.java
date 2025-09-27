package ArrayJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 7, 5, 3, 2};
        List<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length - 1];
        leaders.add(max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }
        System.out.println(leaders.reversed());
    }
}
