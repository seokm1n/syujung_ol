package q571;

import java.util.Scanner;

public class Main {
	public void printLine() {
		System.out.println("~!@#$^&*()_+|");
	}


//	public static void printLine2() { System.out.println("~!@#$^&*()_+|");}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// 1. instance method
		Main n1 = new Main();
		for (int i = 0; i < n; i++) {
			n1.printLine();
		}

//	2. static method printLine2(); Main.printLine2();

	}
}
