package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

//		int min = num[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
