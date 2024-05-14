import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int count = 0;

        for(int j = 0; j < n; j++){
            for(int k = j + 1; k < n; k++){
                if (a[j] == a[k]){
                    count += 1;
                    break;
                }
            }
        }

        System.out.println(n - count);
        scanner.close();
    }
}
