import java.util.Scanner;

public class ABC352C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                AB[i][j] = scanner.nextInt();
            }
        }

        long a_total = 0;
        for (int i = 0; i < N; i++) {
            a_total += AB[i][0];
        }

        int[] head_height = new int[N];
        for (int i = 0; i < N; i++) {
            head_height[i] = AB[i][1] - AB[i][0];
        }
        int max_head_height_index = 0;
        for (int i = 1; i < N; i++) {
            if (head_height[max_head_height_index] < head_height[i]) {
                max_head_height_index = i;
            }
        }
        long total = a_total + head_height[max_head_height_index];
        System.out.println(total);
        scanner.close();
    }
}
