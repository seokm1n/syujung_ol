package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] arr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(arr[a-1] + arr[b-1]);
	}
}
