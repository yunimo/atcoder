//修正点 indexの確認が甘かった miss: N - 1 が N
//for文の範囲 miss: <= が <
//N = 1 のとき判定できない

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] input = new int[N+1][3]; //初期状態分 +1
        input[0][0] = 0; //初期状態
        input[0][1] = 0;
        input[0][2] = 0;

        for (int i = 1; i <= N; i++){
            for (int j = 0; j < 3; j++){
                input[i][j] = scanner.nextInt();
            }
        }
        
        boolean can = true;

        for (int i = 0; i < N; i++){
            int interval = input[i+1][0] - input[i][0];
            int xMove = input[i+1][1] - input[i][1];
            int yMove = input[i+1][2] - input[i][2];
            boolean can2 = false;

            for (int a = 0; a <= interval; a++){
                for (int b = 0; b <= interval - a; b++){
                    for (int c = 0; c <= interval - a - b; c++){
                        int d = interval - a - b - c;
                        if (xMove == a - b && yMove == c - d){
                            can2 = true;
                            break;
                        }
                    }
                    if (can2){
                        break;
                    }
                }
                if (can2){
                    break;
                }
            }
            if (!can2){
                can = false;
                break;
            }
        }
        if(can) System.out.println("Yes");
        else System.out.println("No");
        scanner.close();
    }
}
