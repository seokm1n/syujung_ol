package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		while (true) {
			int n = sc.nextInt();
			count++;
			if (n >= 100) {
				sum += n;
				break;
			}
			sum += n;

		}
		double avg = sum / count;
		sc.close();
		System.out.println((int)sum);
		System.out.printf("%.1f", avg);
	}
}