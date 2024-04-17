import java.util.Scanner;

public class ABC349A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int total = 0;

        for (int i = 0; i < N-1; i++){
            total += scanner.nextInt();
        }

        System.out.println(-total);

    }
}
