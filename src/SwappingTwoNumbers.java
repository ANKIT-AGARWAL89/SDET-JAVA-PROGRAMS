import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the a value");
        int a = sc.nextInt();
        System.out.println("write the b value");
        int b = sc.nextInt();
        System.out.println("Before swap");
        System.out.println("a: "+ a +" b: "+ b);
        //Logic 1: Using 3rd variable
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After swap");
//        System.out.println("a: "+a+" b: "+b);

        //Logic 2: Without using 3rd variable
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println("After swap");
//        System.out.println("a: "+a+" b: "+b);

        //Logic 3: Without using 3rd variable
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println("After swap");
//        System.out.println("a: "+a+" b: "+b);

        //Logic 4: Without using 3rd variable
//        b = a+b-(a=b);
//        System.out.println("After swap");
//        System.out.println("a: "+a+" b: "+b);

        //Logic 5: Without using 3rd variable
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap");
        System.out.println("a: "+a+" b: "+b);
    }
}
