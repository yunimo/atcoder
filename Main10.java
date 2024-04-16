package Atcoder;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        String[] divide = {"dream", "dreamer", "erase", "eraser"};

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        // 後ろから解くかわりにすべての文字列を「左右反転」する
        StringBuilder reversedS = new StringBuilder(S).reverse();
        for (int i = 0; i < 4; ++i)
            divide[i] = new StringBuilder(divide[i]).reverse().toString();

        // 端から切っていく
        boolean can = true;
        for (int i = 0; i < reversedS.length();) {
            boolean can2 = false; // 4 個の文字列たちどれかで divide できるか
            for (int j = 0; j < 4; ++j) {
                String d = divide[j];
                if (i + d.length() <= reversedS.length() && reversedS.substring(i, i + d.length()).equals(d)) {
                    // d で divide できるか
                    can2 = true;
                    i += d.length(); // divide できたら i を進める
                }
            }
            if (!can2) { // divide できなかったら
                can = false;
                break;
            }
        }
        if (can) System.out.println("YES");
        else System.out.println("NO");
        scanner.close();
    }
}
