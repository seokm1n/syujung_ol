package q1840;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] num = new int[x + 1][y + 1];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
