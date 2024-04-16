package Atcoder;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        bubbleSort(a);

        int Alice = 0;
        int Bob = 0;

        for(int j = n - 1; j >= 0; j-=2){
            Alice += a[j];
        }

        for(int j = n - 2; j >= 0; j-=2){
            Bob += a[j];
        }

        System.out.println(Alice - Bob);
        scanner.close();
    }

    public static void bubbleSort(int[] array){
            int n = array.length;
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < n - i - 1; j++){
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
    }
}
