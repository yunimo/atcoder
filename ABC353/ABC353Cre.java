import java.util.Arrays;
import java.util.Scanner;

public class ABC353Cre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int r = N;
        long cnt = 0, res = 0;
        for (int i = 0; i < N; i++) {
            r = Math.max(r, i + 1);
            while (r - 1 > i && A[r - 1] + A[i] >= 100000000) {
                r--;
            }
            cnt += N - r; //r--した数
        }

        for (int i = 0; i < N; i++) {
            res += (long) A[i] * (N - 1);
        }
        res -= cnt * 100000000;
        System.out.println(res);
    }
}
