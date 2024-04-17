import java.util.Scanner;

public class ABC349D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        for (int n = L; n < R;) {
            int rslt = R - n;
            int i, j = 0;
            if (n == 0) { // 0
                i = log2(R, rslt);
                j = 0;
                n += 2 ^ i;
            } else if (n % 2 == 0) { // 偶数
                i = log2(L, rslt);
                j = n / 2 ^ i;
                n += 2 ^ i;
            } else { // 奇数
                i = 0;
                j = n;
                n += 1;
            }
            int l = 2 ^ i * j;
            int r = 2 ^ i * (j + 1);
            System.out.println(l + " " + r);
        }
    }

    public static int log2(int x, int rslt) {

        int a = (int)(Math.log(x) / Math.log(2));
        boolean satisfied = false;
        while (!satisfied) {
            if (a <= rslt){
                satisfied = true;
            } else {
                a--;
            }
        }
        return a;
    }
}
