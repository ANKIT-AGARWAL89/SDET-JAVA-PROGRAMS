import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        //Logic 1: Using concatenation
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);

        //Logic 2: Using the CharArray
//        char[] arrayOfChar = str.toCharArray();
//        for (int i = arrayOfChar.length - 1; i >= 0; i--) {
//            rev = rev + arrayOfChar[i];
//        }
//        System.out.println(rev);

        //Logic 3: Using the stringBuilder reverse method
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}
