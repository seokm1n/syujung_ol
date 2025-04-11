package q1338;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        char[][] arr = new char[n][n];
         
        char ch = 'A';
 
        for(int i = 0; i <= n; i++) {
            int k = n-1;
            for(int j = i; j < n; j++) {
                if(ch > 'Z') ch = 'A';
                arr[j][k--] = ch++;
            }
        }
         
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == '\0') System.out.print("  ");
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}