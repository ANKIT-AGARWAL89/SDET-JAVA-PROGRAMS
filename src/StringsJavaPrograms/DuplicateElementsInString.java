package StringsJavaPrograms;

import java.util.HashMap;

public class DuplicateElementsInString {
    public static void main(String[] args) {
        String str = "fehubesjbc";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }

    }
}

