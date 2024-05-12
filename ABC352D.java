import java.util.Scanner;

public class ABC352D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] P = new int[N];
        int[] p_pos = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        boolean can = true;
        int num = 0;
        while (can) { // ソート
            num++;
            for (int i = 0; i < N; i++) {
                if (num == P[i]) {
                    p_pos[num - 1] = i + 1;
                    break;
                }
            }
            if (num == N) {
                can = false;
            }
        }

        int temp_num = 0;
        int result = N;
        while (temp_num + K < p_pos.length + 1) {
            int[] index_line = new int[K];
            for (int i = 0; i < K; i++) { // K個抜き出す
                index_line[i] = p_pos[temp_num + i];
            }
            int intMax = index_line[0];
            int intMin = index_line[0];
            for (int j = 1; j < index_line.length; j++) { // 抜き出した数列の最大値，最小値を求める
                if (intMax < index_line[j]) {
                    intMax = index_line[j];
                } else if (intMin > index_line[j]) {
                    intMin = index_line[j];
                }
            }
            int result_sub = intMax - intMin;
            if (result > result_sub) {
                result = result_sub;
            }
            temp_num++;
        }
        System.out.println(result);
        scanner.close();
    }
}
