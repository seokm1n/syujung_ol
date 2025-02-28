package q190;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = { "flower", "rose", "lily", "daffodil", "azalea" };
		char ch = sc.next().charAt(0);
		sc.close();

		int count = 0;
		for (int i = 0; i < str.length; i++) {
			int len = str[i].length();
			if (str[i].charAt(1) == ch || str[i].charAt(2) == ch ) {
				System.out.println(str[i]);
				count++;
			}
		}
		System.out.println(count);
	}
}