package MathematicalPrograms;

import java.util.Scanner;

public class NumberOfDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        if (num < 0) {
            num = num * -1;
        } else if (num == 0) {
            num = 1;
        }

        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
