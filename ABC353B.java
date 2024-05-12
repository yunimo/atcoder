import java.util.Scanner;

public class ABC353B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        int total = 0;
        int num = 0;
        for (int i = num; i < N;) {
            if (num == N) {
                count++;
                break;
            }
            total += A[num];
            if (total > K) {
                count++;
                total = 0;
            } else {
                num++;
            }
        }
        System.out.println(count);
    }
}
