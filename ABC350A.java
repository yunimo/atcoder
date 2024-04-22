import java.util.Scanner;

public class ABC350A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String s = S.substring(3, 6);
        int n = Integer.parseInt(s);

        if (1 <= n && n <= 349 && n != 316){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
