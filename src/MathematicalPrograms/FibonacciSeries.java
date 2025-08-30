package MathematicalPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
//        0, 1, 1, 2, 3, 5, 8
        int first = 0, second = 1;
        int next=0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i <= 5; i++) {
            next = first+second;
            first = second;
            second = next;
            System.out.println(next);
        }

    }
}
