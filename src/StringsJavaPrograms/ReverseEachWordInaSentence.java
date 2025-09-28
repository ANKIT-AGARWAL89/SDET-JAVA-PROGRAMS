package StringsJavaPrograms;

public class ReverseEachWordInaSentence {
    public static void main(String[] args) {
        String str = "Hello Ankit ji";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String eachWord : words) {
            result.append(new StringBuilder(eachWord).reverse()).append(" ");
        }
        System.out.print(result.toString().trim());
    }
}
