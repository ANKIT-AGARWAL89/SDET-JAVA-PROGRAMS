package StringsJavaPrograms;

public class Count_of_occurence_of_letters_in_a_string {
    public static void main(String[] args) {
//        Input : str = "elephant"
//        Output : e2 l1 p1 h1 a1 n1 t1
        String str = "elepahanta";
        int count;
        char[] c = str.toCharArray();
        boolean[] visited = new boolean[c.length];
        //visited[0]=false;
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (c[i] == c[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.print(c[i] + "" + count);
            System.out.print(" ");
        }
    }
}

