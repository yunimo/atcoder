import java.util.Scanner;

public class ABC350B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] T = new int[Q];
        for (int i = 0; i < Q; i++){
            T[i] = scanner.nextInt();
        }

        int pullNum = 0;

        for (int i = 1; i <= N; i++){
            boolean odd = false;
            for (int j = 0; j < Q; j++){
                if (!odd && i == T[j]){
                    odd = true;
                    pullNum++;
                } else if (odd && i == T[j]){
                    odd = false;
                    pullNum --;
                }
            }
        }

        int total = N - pullNum;
        System.out.println(total);
    }
}
