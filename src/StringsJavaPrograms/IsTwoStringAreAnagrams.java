package StringsJavaPrograms;

import java.util.Arrays;

public class IsTwoStringAreAnagrams {
    public static void main(String[] args) {

        // TC - O(N)
        String str1 = "silent";
        String str2 = "listen";
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
        if (strArray1.length != strArray2.length) {
            System.out.println("false");
            return;
        }
        int[] count = new int[26]; // a-z => 26 character
        for (int i=0;i<strArray1.length;i++){
            count[strArray1[i]-'a']++;
            count[strArray2[i]-'a']--;
        }
        for (int c:count){
            if (c!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");

        // TC - O(NLOGN)
//        String str1 = "silent";
//        String str2 = "listen";
//        char[] strArray1 = str1.toCharArray();
//        char[] strArray2 = str2.toCharArray();
//        Arrays.sort(strArray1);
//        Arrays.sort(strArray2);
//        System.out.println(Arrays.equals(strArray1, strArray2));
    }
}
