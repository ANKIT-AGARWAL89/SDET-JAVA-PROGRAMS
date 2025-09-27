package ArrayJavaPrograms;

import java.util.HashMap;

public class IsArrayContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,2,5,7};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (int key : map.keySet()){
            if (map.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
