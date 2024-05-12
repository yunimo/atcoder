import java.util.Scanner;

public class ABC353C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long total = 0;
        for (int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                long sub_total = 0;
                sub_total = (long)A[i] + A[j];
                total += (sub_total % (100000000));
            }
        }
        System.out.println(total);
    }
}
