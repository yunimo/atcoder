import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int maxOpe = 0;
        boolean allEven = true;

        while (allEven) {
            for (int i = 0; i < n; i++){
                if (a[i] % 2 == 1){
                    allEven = false;
                } else {
                    a[i] = a[i] / 2;
                }
            }
            if (allEven) {
                maxOpe++;
            }
        }
        System.out.println(maxOpe);
        sc.close();
    }
}
