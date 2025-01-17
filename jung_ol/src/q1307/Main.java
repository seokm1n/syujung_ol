package q1307;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 1; j--) {
				int ch = 'A' + n * j - num;
				while (true) {
					if (ch >= 'Z' + 1) {
						ch = ch - 'Z' + 'A' - 1;
					} else
						break;
				}
				char S = (char) (ch);

				System.out.printf("%s ", S);
			}
			System.out.println();
			num++;
		}
	}
}
