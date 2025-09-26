package Miscellaneous;

public class Somethings {
    public static void main(String[] args) {
//        Input:
//        a = "ABC"
//        b = "DEFGH"
//        Output: "ADBECFGH"

        String a = "ABC";
        String b = "DEFGH";
        String c = "";
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            c = c + a.charAt(i++);
            c = c + b.charAt(j++);
        }
        if (i < a.length()) {
            c = c + a.substring(i);
        }
        if (j < b.length()) {
            c = c + b.substring(j);
        }
        System.out.println(c);
    }
}
