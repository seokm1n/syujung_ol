package q573;

import java.util.Scanner;

public class Main {
	public void square(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i * n; j < (i + 1) * n; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
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
