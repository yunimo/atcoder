import java.util.Scanner;

public class ABC349B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] s = new char[S.length()];
        
        for (int i = 0; i < S.length(); i++){
            s[i] = S.charAt(i);
        }

        int[] count = new int[S.length()];

        for (int i = 0; i < S.length(); i++){
            for (int j = i + 1; j < S.length() - i; j++){
                if (s[i] == s[j]){
                    count[i] = 1;
                    break;
                }
            }
        }
        
    }
}
