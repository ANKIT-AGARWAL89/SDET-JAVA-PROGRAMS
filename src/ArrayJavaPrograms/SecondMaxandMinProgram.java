package ArrayJavaPrograms;

public class SecondMaxandMinProgram {
    public static void main(String[] args) {
        double[] arr = {-2, -4.3, -1, -4, -2, -4, -4.2, -6};
        double firstMax = arr[0];
        double secondMax = arr[1];
        double firstMin = arr[1];
        double secondMin = arr[1];

        // 1st max and 2nd max

        if (firstMax < secondMax) {
            firstMax = firstMax + secondMax - (secondMax = firstMax);
        }
        for (int i = 2; i < arr.length; i++) {
            if (secondMax < arr[i] && arr[i] < firstMax) {
                secondMax = arr[i];
            } else if (firstMax < arr[i]) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if (secondMin > arr[i] && arr[i] > firstMin) {
                secondMin = arr[i];
            } else if (firstMin > arr[i]) {
                secondMin = firstMin;
                firstMin = arr[i];
            }
        }

        // 1st min and 2nd min
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(firstMin);
        System.out.println(secondMin);
    }
}
