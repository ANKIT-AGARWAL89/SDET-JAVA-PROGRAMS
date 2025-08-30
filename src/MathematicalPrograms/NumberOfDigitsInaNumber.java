package MathematicalPrograms;

public class NumberOfDigitsInaNumber {
    public static void main(String[] args) {
        long num = 832897832713l;
        int count=0;
        while (num!=0){
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
