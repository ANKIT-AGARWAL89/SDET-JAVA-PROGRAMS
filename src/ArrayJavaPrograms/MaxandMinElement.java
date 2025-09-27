package ArrayJavaPrograms;

public class MaxandMinElement {
    public static void main(String[] args) {
        int[] arr = {-2, 4, -1, 5, 2, -4, 9, 21, 1, 21};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
