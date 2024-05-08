import java.util.Scanner;

public class ABC352B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        String T = scanner.nextLine();

        int s_num = 0;
        int t_num = 0;
        boolean con = true;
        while (con) {
            char s = S.charAt(s_num);
            for (int i = t_num; i < T.length(); i++) {
                if (s == T.charAt(i)) {
                    s_num++;
                    t_num = i+1;
                    System.out.print(i + 1 + " ");
                    if (S.charAt(S.length() - 1) == s) {
                        con = false;
                    }
                }
            }
        }
        scanner.close();
    }
}
