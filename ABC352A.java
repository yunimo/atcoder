import java.util.Scanner;

public class ABC352A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }
        boolean ok = false;
        for (int i = X; i <= Y; i++) {
            if (i == Z) {
                ok = true;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
