package q5931;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.print(i + " ");
        	}
        	System.out.println();
        }
	}
}
