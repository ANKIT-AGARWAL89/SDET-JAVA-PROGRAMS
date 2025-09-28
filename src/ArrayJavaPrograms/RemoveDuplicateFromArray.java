package ArrayJavaPrograms;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        // without Hashset
        int[] arr = {3, 5, 2, 4, 2, 5, 6, 4, 2, 1, 4};
        int flag = 0;
        int index = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                temp[index++] = arr[i];
            }
        }
        for (int i=0; i<index;i++)
            System.out.print(temp[i] + "\t");


        // Approch with Hashset
//        int[] arr = {3,5,2,4,2,5,6,4,2,1,4};
//        HashSet<Integer> hs = new HashSet<>();
//        for (int x:arr){
//            hs.add(x);
//        }
//        System.out.println(hs);
    }
}
