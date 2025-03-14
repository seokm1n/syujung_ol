package q1840;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] array = new int[x][y];
		int cheese = 0;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				array[i][j] = sc.nextInt();
				if (array[i][j] == 1) {
					cheese++;
				}
			}
		}
		sc.close();

		int time = 0;
		int lastcheese = cheese;

		while (true) {
			time++;
			cheese -= find(array, 0, 0, x, y, time + 3, -time, 1, -1);

			if (cheese == 0) {
				break;
			}

			lastcheese = cheese;
		}

		System.out.println(time);
		System.out.println(lastcheese);
	}

	public static int find(int[][] array, int x, int y, int xsize, int ysize, int num, int num2, int numup,
			int num2up) {
		if (x < 0 || y < 0 || x >= xsize || y >= ysize) {
			return 0;
		}

		int value = array[x][y];

		if (value == num) {
			return 0;
		}

		if (value == -1 || value == num2 - numup) {
			array[x][y] = num2;
			return 1;
		}

		int amount = 0;

		value = array[x][y];

		if (value == 0 || value == num - 1 || value == num2 - num2up) {
			array[x][y] = num;
			amount += find(array, x - 1, y, xsize, ysize, num, num2, numup, num2up);
			amount += find(array, x + 1, y, xsize, ysize, num, num2, numup, num2up);
			amount += find(array, x, y - 1, xsize, ysize, num, num2, numup, num2up);
			amount += find(array, x, y + 1, xsize, ysize, num, num2, numup, num2up);
		}

		return amount;
	}
}
