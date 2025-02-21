package q568;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];

		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] * arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
