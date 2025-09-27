package ArrayJavaPrograms;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        // Kadane’s Algorithm - o(n)
        int[] arr = {2, -5, 1, 4, -2, 4, -5};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = -1;
        int ansStart = -1;
        int ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }
        System.out.println(max);
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
