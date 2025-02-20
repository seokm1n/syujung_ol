package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
