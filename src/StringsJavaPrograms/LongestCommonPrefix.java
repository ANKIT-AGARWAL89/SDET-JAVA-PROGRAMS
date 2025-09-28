package StringsJavaPrograms;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        // Approch 2
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs);
        char[] start = strs[0].toCharArray();
        char[] end = strs[strs.length-1].toCharArray();
        int i=0, j=0;
        StringBuilder prefix = new StringBuilder();
        while (i<start.length && j<end.length){
            if (start[i]==end[j]){
                prefix.append(start[i]);
                i++; j++;
            }
            else{
                break;
            }
        }
        System.out.println(prefix.toString());


        // Approch 1
//        String[] strs = {"flower", "flow", "flight"};
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    System.out.println("");
//                    return;
//                }
//            }
//
//        }
//        System.out.println(prefix);
    }
}
