package q572;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.printf("%.2f", circle(n));
	}

	private static double circle(int r) {
		return r * r * 3.14;
	}
}