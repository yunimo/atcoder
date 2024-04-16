package Atcoder;

import java.util.*;

public class Main51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        
        int selectNum = 0;

        for (int i = 0; i < a+1; i++){
            for (int j = 0; j < b+1; j++){
                for (int k = 0; k < c+1; k++){
                    int total = i*500 + j*100 + k*50; // 合計金額を計算
                    if (total == x){
                        selectNum++;
                    } else if (total > x) { // 合計金額がxを超えたらループを終了
                        break;
                    }
                }
            }
        }
        System.out.println(selectNum);
        sc.close();
    }
}
