package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 3, 2, 7};
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[minIndex] + arr[i] - (arr[i] = arr[minIndex]);
        }
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
