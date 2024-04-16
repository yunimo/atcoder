package Atcoder;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            int subSum = 0;
            int num = i;

            while (num > 0) {
                subSum += (num % 10);
                num /= 10;
            }

            if (a <= subSum && subSum <= b){
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
