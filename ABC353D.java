import java.util.Scanner;

public class ABC353D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }
        long total = 0;
        for (int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                String a1 = A[i];
                String a2 = A[j];
                total += Long.parseLong(a1+a2);
            }
        }
        total %= 998244353;
        System.out.println(total);
    }
}
