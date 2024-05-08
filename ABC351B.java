import java.util.Scanner;

public class ABC351B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[][] A = new String[N][N];
        String[][] B = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = scanner.next();
            }
        }

        int result_i = 0;
        int result_j = 0;
        boolean con = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!A[i][j].equals(B[i][j])) {
                    result_i = i + 1;
                    result_j = j + 1;
                    con = false;
                    break;
                }
            }
            if (!con) {
                break;
            }
        }
        System.out.println(result_i + " " + result_j);
        scanner.close();
    }
}
