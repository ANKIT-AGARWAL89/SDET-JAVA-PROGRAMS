import java.util.Scanner;

public class Reverse_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //1234

        //Logic 1: using mathematical algoritham
//        int rev = 0;
//        while (num!=0){
//            rev = rev*10 + num%10; // extacting last digit*10 and adding with 2nd last digit
//            num/=10;
//        }
//        System.out.println(rev);

        //Logic 2: using StringBuffer reverse method
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println(rev);

        //Logic 3: using StringBuilder reverse method
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        StringBuilder rev = stringBuilder.reverse();
        System.out.println(rev);
    }
}