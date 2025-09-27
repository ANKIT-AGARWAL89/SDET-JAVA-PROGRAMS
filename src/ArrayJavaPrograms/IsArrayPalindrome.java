package ArrayJavaPrograms;

public class IsArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int start = 0;
        int end = arr.length - 1;
        Boolean isArrayPalindrome = true;
        while (start <= end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                isArrayPalindrome = false;
                break;
            }
        }
        System.out.println(isArrayPalindrome);
    }
}
