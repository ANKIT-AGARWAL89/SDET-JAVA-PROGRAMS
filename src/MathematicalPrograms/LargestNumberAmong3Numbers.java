package MathematicalPrograms;

public class LargestNumberAmong3Numbers {
    public static void main(String[] args) {
        int a = 41, b = 45, c = 43;

//        Logic 1:
//        if (a >= b && a >= c) {
//            System.out.println(a);
//        } else if (b >= a && b >= c) {
//            System.out.println(b);
//        } else
//            System.out.println(c);

//        Logic 2: Using ternary operator
//        int longest = c > (a > b ? a : b) ? c : (a > b ? a : b);
//        System.out.println(longest);

//        Logic 3: Using ternary operator
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
