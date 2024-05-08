import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[9];
        int[] B = new int[8];

        for (int i = 0; i < 9; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            B[i] = scanner.nextInt();
        }

        int total_A = 0;
        int total_B = 0;

        for (int i = 0; i < 9; i++) {
            total_A += A[i];
        } 
        for (int i = 0; i < 8; i++) {
            total_B += B[i];
        }
        System.out.println(total_A - total_B + 1);
    }
}
