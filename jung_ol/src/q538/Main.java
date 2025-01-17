package q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int n = sc.nextInt();
			if (n>0) System.out.println("positive integer");
			else if (n==0) break;
			else System.out.println("negative number");
		}
		sc.close();
	}
}
