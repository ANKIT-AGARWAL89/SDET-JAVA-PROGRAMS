package ArrayJavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,6,7,3,3,6,7,2,4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (int key:map.keySet()){
            if (map.get(key)==1){
                System.out.println(key);
                return;
            }
        }
        System.out.println("not exist");
     }
}
