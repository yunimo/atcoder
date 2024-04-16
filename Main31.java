package Atcoder;

import java.util.*;

public class Main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int count = 0;

        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
