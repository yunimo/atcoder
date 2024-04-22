import java.util.Scanner;

public class ABC350C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int sortNum = 0;
        boolean change = true;
        int arrayNum = 0;
        int[] resultArray = new int[N * 2];

        while (change) {
            change = false;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (A[i] > A[j]) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        resultArray[arrayNum] = A[i];
                        resultArray[arrayNum + 1] = A[j];
                        arrayNum += 2;
                        sortNum++;
                        change = true;
                        break;
                    }
                    if (change) {
                        break;
                    }
                }
                if (change) {
                    break;
                }
            }
        }

        System.out.println(sortNum);
        for (int i = 0; i < arrayNum; i += 2) {
            System.out.println(resultArray[i] + " " + resultArray[i + 1]);
        }
    }
}
