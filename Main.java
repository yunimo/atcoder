import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] result = new int[N];
        boolean check = true;
        int right_num = 0;
        for (int i = 0; i < N; i++) {
            result[right_num] = A[i];
            check = false;
            while (!check) {
                if (right_num != 0) {
                    if (result[right_num] != result[right_num - 1]) {
                        check = true;
                    } else {
                        if (result[right_num] == 0){
                            result[right_num - 1] = 1;
                        } else {
                        result[right_num - 1] = result[right_num] + result[right_num - 1];
                        right_num--;
                        }
                    }
                } else {
                    check = true;
                }
                if (check) {
                    right_num++;
                }
            }
        }
        System.out.println(right_num -1);
    }
}
