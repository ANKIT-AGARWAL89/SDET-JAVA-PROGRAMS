package ArrayJavaPrograms;

import java.util.HashMap;

public class MajorityOfElement {
    public static void main(String[] args) {
        // Boyer–Moore Voting Algorithm
        int[] arr = {3, 4, 2, 3, 1, 5, 3, 3, 2, 5, 3};
        int count = 0, candidate = -1;
        for (int x : arr) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else count--;
        }
        count=0;
        for (int x:arr){
            if (x==candidate){
                count++;
            }
        }
        if (count==arr.length/2){
            System.out.println(candidate);
        }else System.out.println("not exist");
    }
}
