package q573;

import java.util.Scanner;

public class Main {
    public void square(int n) {
    	int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	num++;
                System.out.print(num + " ");
            }
            System.out.println(); // 줄바꿈 추가
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Main m = new Main();
        m.square(n);
    }
}
