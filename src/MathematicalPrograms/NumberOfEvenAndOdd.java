package MathematicalPrograms;

public class NumberOfEvenAndOdd {
    public static void main(String[] args) {
        long num = 23434135L;
        int evenCount = 0, oddCount = 0;
        while (num != 0) {

            if ((num % 10) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("even count: " + evenCount + " odd count: " + oddCount);
    }
}
