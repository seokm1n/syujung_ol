package q1341;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a < 2 || a > 9 || b < 2 || b > 9) {
				System.out.println("INPUT ERROR!");
			} else {
				if (a > b) {
					for (int i = a; i >= b; i--) {
						for (int j = 1; j <= 9; j++) {
							System.out.printf("%d * %d = %2d   ", i, j, i * j);
							if (j % 3 == 0) {
								System.out.println();
							}
						}
						System.out.println();
					}
				} else {
					for (int i = a; i <= b; i++) {
						for (int j = 1; j <= 9; j++) {
							System.out.printf("%d * %d = %2d   ", i, j, i * j);
							if (j % 3 == 0) {
								System.out.println();
							}
						}
						System.out.println();
					}
				}
				break;
			}
			sc.close();
		}
	}
}