import java.util.Scanner;

public class ABC353A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int rslt = -1;
        for (int i = 1; i < N; i++) {
            int maxNum = H[0];
            if (maxNum < H[i]) {
                rslt = i + 1;
                break;
            }
        }
        System.out.println(rslt);
    }
}
