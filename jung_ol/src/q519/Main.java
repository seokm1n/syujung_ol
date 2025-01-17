package q519;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();		
		}
		sc.close();
		arr[0] = arr[0] +100;
		arr[1] = arr[1] % 10;
		System.out.println(arr[0] +" "+ arr[1]);
	}
}