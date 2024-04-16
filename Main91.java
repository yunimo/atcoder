package Atcoder;

import java.util.*;

public class Main91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int y = scanner.nextInt();

        int a = -1;
        int b = -1;
        int c = -1;

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n - i; j++){
                int k = n - i - j;
                    if (10000 * i + 5000 * j + 1000 * k == y){
                        a = i;
                        b = j;
                        c = k;
                    }
                }
            }
        System.out.println(a + " " + b + " " + c);
        scanner.close();
    }
}
