package StringsJavaPrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev.equalsIgnoreCase(str) ? "its a palindrome string" : "its not palindrome string");
    }
}
