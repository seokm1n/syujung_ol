package q2259;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] sqr = new int[2][6];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < 6; i++) {
			sqr[0][i] = sc.nextInt();
			sqr[1][i] = sc.nextInt();
		}
		sc.close();

		int hmax = 0, vmax = 0;
		int total = 0, etotal = 0;
		int[] cnt = new int[4];
		int[] type = new int[2];

		// 전체 넓이
		for (int i = 0; i < 6; i++) {
			if (sqr[0][i] == 3 || sqr[0][i] == 4) {
				if (sqr[1][i] > hmax)
					hmax = sqr[1][i];

				if (sqr[0][i] == 3)
					cnt[2]++;
				else
					cnt[3]++;
			} else {
				if (sqr[1][i] > vmax)
					vmax = sqr[1][i];

				if (sqr[0][i] == 2)
					cnt[1]++;
				else
					cnt[0]++;
			}
		}
		total = hmax * vmax;

		// 타입 결정
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 2) {
				if (i == 2 || i == 3)
					type[0] = i;
				else
					type[1] = i;
			}
		}

		int idx = 0;
		// 0-동 1-서 2-남 3-북
		if (type[0] == 2) {
			if (type[1] == 0) { // 남동
				for (int i = 0; i < 6; i++) {
					if (sqr[0][i] == 4) {
						idx = i;
						break;
					}
				}
			} else { // 남서
				for (int i = 0; i < 6; i++) {
					if (sqr[0][i] == 1) {
						idx = i;
						break;
					}
				}
			}
		} else {
			if (type[1] == 0) { // 북동
				for (int i = 0; i < 6; i++) {
					if (sqr[0][i] == 2) {
						idx = i;
						break;
					}
				}
			} else { // 북서
				for (int i = 0; i < 6; i++) {
					if (sqr[0][i] == 3) {
						idx = i;
						break;
					}
				}
			}
		}

		if (idx < 3) {
			etotal = sqr[1][(idx + 3) % 6] * sqr[1][(idx + 4) % 6];
		} else {
			etotal = sqr[1][idx - 3] * sqr[1][idx - 2];
		}
		total = total - etotal;
		System.out.println(total * n);
	}
}