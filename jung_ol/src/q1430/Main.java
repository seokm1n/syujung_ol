package q1430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        int n = n1 * n2 * n3;
        int[] count = new int[10];

        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {
            int cnt = num.charAt(i) - '0';
            count[cnt]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
