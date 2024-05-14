import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt();

        int ten_thousand = 0;
        int five_thousand = 0;
        int one_thousand = 0;

        one_thousand = y / 1000;
        five_thousand = y / 5000;
        ten_thousand = y / 10000;

        for (int i = 0; i <= one_thousand; i++){
            for (int j = 0; j <= five_thousand; j++){
                for (int k = 0; k <= ten_thousand; k++){
                    if (10000 * k + 5000 * j + 1000 * i == y && k + j + i == n){
                        System.out.println(k + " " + j + " " + i);
                        sc.close();
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1 + " " + -1 + " " + -1);
        sc.close();
    }
}
