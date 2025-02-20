package q565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            int n = num / 10;
            arr[n]++;
        }
        sc.close();
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " : " + arr[i]);
            }
        }
    }
}