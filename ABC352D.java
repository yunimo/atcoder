import java.util.Scanner;

public class ABC352D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                AB[i][j] = scanner.nextInt();
            }
        }

        int a_total = 0;
        for (int i = 0; i < N; i++) {
            a_total += AB[i][0];
        }

        int max_head_height_index = 0; // 最大の頭の高さを持つ行のインデックスを保存する変数
        for (int i = 0; i < N; i++) {
            if (AB[i][1] > AB[max_head_height_index][1]) { // 最大の頭の高さを持つ行のインデックスを更新する条件
                max_head_height_index = i;
            }
        }
        int total = a_total + AB[max_head_height_index][1] - AB[max_head_height_index][0]; // 最大の頭の高さを持つ行の頭の高さを追加
        System.out.println(total);
    }
}
