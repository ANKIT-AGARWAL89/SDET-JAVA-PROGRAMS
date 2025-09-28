package SearchingAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        // Worst TC - O(N)
        int[] arr = {4, 5, 1, 6, 3, 2, 7};
        int target = 4;
        int found = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println(i);
                found=1;
                break;
            }
        }
        if (found==0){
            System.out.println("Not found");
        }
    }
}
