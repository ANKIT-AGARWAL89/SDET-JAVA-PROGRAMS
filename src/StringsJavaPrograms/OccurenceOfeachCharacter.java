package StringsJavaPrograms;

import java.util.HashMap;

public class OccurenceOfeachCharacter {
    public static void main(String[] args) {
        String str = "jdbjsmdkcn";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
