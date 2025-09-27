package ArrayJavaPrograms;

public class MoveZerosAtEndofArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 0, 3, 0, 0, 0, 1, 2, 3, 5, 0};
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                j++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
