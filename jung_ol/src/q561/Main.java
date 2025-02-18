package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max = 0;
		int min = 10000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 100 && arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] >= 100 && arr[i] < min) {
				min = arr[i];
			}
		}
		if (max == 0) max = 100;
		if (min == 10000) min = 100;
		System.out.println(max + " " + min);
	}
}