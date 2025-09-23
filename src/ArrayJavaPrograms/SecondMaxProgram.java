package ArrayJavaPrograms;

import java.util.Scanner;

public class SecondMaxProgram {
    public static void main(String[] args) {
        double[] arr = {-2, -4.3, -1, -4, -2, -4, -4.2, -6};
        double first = arr[0];
        double second = arr[1];
        if (first < second) {
            first = first + second - (second = first);
        }
        for (int i = 2; i < arr.length; i++) {
            if (second < arr[i] && arr[i] < first) {
                second = arr[i];
            } else if (first < arr[i]) {
                second = first;
                first = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
