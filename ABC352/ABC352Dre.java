import java.util.Scanner;
import java.util.TreeSet;

public class ABC352Dre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] p_pos = new int[N];
        for (int i = 0; i < N; i++) {
            int p = scanner.nextInt();
            p_pos[p - 1] = i;
        }

        TreeSet<Integer> st = new TreeSet<>();
        for (int i = 0; i < K; i++) { //1回目
            st.add(p_pos[i]);
        }
        int ans = st.last() - st.first();
        for (int i = K; i < N; i++) { //2回目以降
            st.remove(p_pos[i - K]);
            st.add(p_pos[i]);
            ans = Math.min(ans, st.last() - st.first());
        }
        System.out.println(ans);
        scanner.close();
    }
}
