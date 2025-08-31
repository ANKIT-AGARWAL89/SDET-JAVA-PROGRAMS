package MathematicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int origNum=num, numForCountdigit = num;
        int rem, sum = 0;
        int count = 0;
        while (numForCountdigit > 0) {
            count++;
            numForCountdigit = numForCountdigit / 10;
        }
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int)Math.pow(rem,count) ;
            num = num / 10;
        }
        System.out.println(sum);
        if (origNum == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
