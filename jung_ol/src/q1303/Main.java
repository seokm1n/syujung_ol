package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.printf("%d ", num);
				num++;
			}
			System.out.println();
		}
		System.out.println();
	}
}
