package StringsJavaPrograms;

public class CountVowelsANDConsonants {
    public static void main(String[] args) {
        String str = "Hello World".toLowerCase();
//        char[] arr = str.toCharArray();
//        int vowelCount = 0;
//        int consonantsCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 'a' && arr[i] < 'z') {
//                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
//                    vowelCount++;
//                else
//                    consonantsCount++;
//            }
//        }
//        System.out.println("vowel : " + vowelCount + " consonants : " + consonantsCount);

        // Approch 2
        int vowel = 0, consonant = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowel++;
                else consonant++;
            }
        }
        System.out.println(vowel + " " + consonant);


    }
}
