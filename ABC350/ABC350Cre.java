import java.util.Scanner;

public class ABC350Cre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] aPos = new int[N];
        for (int i = 0; i < N; i++) {
            aPos[A[i] - 1] = i;
        }
        int total = 0;
        //int[] array = new int[N * 2];
        //int arrayNum = 0;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (A[i] != i + 1) {
                int temp = A[aPos[i]];
                A[aPos[i]] = A[i];
                A[i] = temp;

                total++;
                output.append(i+1).append(" ").append(A[aPos[i]]).append("\n");
            }
        }
        System.out.println(total);
        System.out.println(output);        
    }
}
