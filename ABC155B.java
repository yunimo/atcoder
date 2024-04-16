package Atcoder;
import java.util.Scanner;

public class ABC155B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = "APPROVED";
        
        for (int i = 0; i < N; i++){
            int a = scanner.nextInt();

            if (a % 2 == 0 && a % 3 != 0 && a % 5 != 0){
                str = "DENIED";
                break;
            }
        }
        System.out.println(str);
        scanner.close();
    }
}
