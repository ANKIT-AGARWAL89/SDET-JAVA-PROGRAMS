package MathematicalPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 21;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag==true){
            System.out.println("not prime");
        }
        else
            System.out.println("prime");
    }
}
