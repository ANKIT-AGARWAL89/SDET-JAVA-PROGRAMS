package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 3, 2, 7};
//        int[] arr = {1,2,3,4,5};
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("array is sorted");
                return;
            }
        }
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
