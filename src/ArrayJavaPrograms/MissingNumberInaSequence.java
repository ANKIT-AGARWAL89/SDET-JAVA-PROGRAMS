package ArrayJavaPrograms;

public class MissingNumberInaSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        int sum = n * (n+1) / 2;
        int component;
        for (int x : arr) {
            sum = sum - x;
        }
        System.out.println(sum);
    }
}
