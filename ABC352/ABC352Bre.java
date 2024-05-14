import java.util.Scanner;

public class ABC352Bre {
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
                    System.out.print(i + 1 + " ");
                    if (s_num == S.length() - 1) {
                        con = false;
                        break;
                    }
                    s_num++;
                    t_num = i + 1;
                    break;
                }
            }
        }
        scanner.close();
    }
}
