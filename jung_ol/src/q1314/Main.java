package q1314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int ch;
                if (j % 2 == 0) {
                    ch = 'A' + (j * n) + num;
                } else {
                    ch = 'A' + (j * n) + (n - 1 - num);
                }
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
