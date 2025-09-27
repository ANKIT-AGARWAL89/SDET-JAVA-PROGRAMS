package ArrayJavaPrograms;

public class SortAnArrayofzeronetwo {
    public static void main(String[] args) {

        // Approach 2 - DNF (dutch national flag)
        int[] arr = {1, 0, 2, 1, 2, 0, 2, 1, 0, 1, 0};
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                arr[low] = arr[low] + arr[mid] - (arr[mid] = arr[low]);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                arr[mid] = arr[mid] + arr[high] - (arr[high] = arr[mid]);
                high--;
            }
        }
        for (int x : arr) {
            System.out.print(x + "\t");
        }


//        Approch 1 -
//
//        int[] arr = {1, 0, 2, 1, 2, 0, 2, 1, 0, 1, 0};
//        int zerocount = 0, onecount = 0, twocount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) zerocount++;
//            else if (arr[i] == 1) onecount++;
//            else twocount++;
//        }
//        for (int i = 0; i < zerocount; i++) {
//            arr[i] = 0;
//        }
//        for (int i = zerocount; i < zerocount + onecount; i++) {
//            arr[i] = 1;
//        }
//        for (int i = zerocount + onecount; i < zerocount + onecount + twocount; i++) {
//            arr[i] = 2;
//        }
//        for (int x : arr) {
//            System.out.print(x+"\t");
//        }
    }
}
