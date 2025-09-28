package StringsJavaPrograms;

import java.util.HashSet;

public class FirstRepeatedCharacterInAstring {
    public static void main(String[] args) {
        String str = "dhuhehcs";
        char[] arr = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char c : arr) {
            if (!set.add(c)){
                System.out.println(c);
                break;
            }
        }

    }

}
