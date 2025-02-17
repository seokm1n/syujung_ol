package q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= m; j++) {
					System.out.print(i * m + j + " ");
				}
			} else {
				for (int j = m; j > 0; j--) {
					System.out.print(i * m + j + " ");
				}
			}
			System.out.println();
		}
	}
}
