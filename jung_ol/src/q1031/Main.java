package q1031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int board[][] = new int[5][5];
		int call[][] = new int[5][5];
		// 빙고판 입력 받기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		// 사회자 부르는 값 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				call[i][j] = sc.nextInt();
			}
		}

		// 사회자 부르는 값 입력받으며 빙고 확인
		int cnt = 0;
		outerLoop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int num = call[i][j];
				cnt++;

				checkNum(board, num);

				if (checkBingo(board) >= 3) {
					System.out.println(cnt);
					break outerLoop;

				}
			}
		}

		sc.close();

	}

	// 사회자가 부른 숫자 빙고판에서 체크
	public static void checkNum(int[][] board, int num) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (board[i][j] == num) {
					board[i][j] = -1;
					return;
				}
			}
		}
	}

	public static int checkBingo(int[][] board) {
		int bingoCnt = 0;

		// 가로 빙고 체크
		for (int i = 0; i < 5; i++) {
			boolean bingo = true;
			for (int j = 0; j < 5; j++) {
				if (board[i][j] != -1) {
					bingo = false;
				}
			}
			if (bingo == true) {
				bingoCnt++;
			}
		}
		// 세로 빙고 체크
		for (int i = 0; i < 5; i++) {
			boolean bingo = true;
			for (int j = 0; j < 5; j++) {
				if (board[j][i] != -1) {
					bingo = false;
				}
			}
			if (bingo == true) {
				bingoCnt++;
			}
		}

		// 왼쪽위 - 오른쪽아래 대각선 빙고 체크
		// 00 11 22 33 44
		boolean bingo1 = true;
		for (int i = 0; i < 5; i++) {
			if (board[i][i] != -1) {
				bingo1 = false;
			}
		}
		if (bingo1 == true) {
			bingoCnt++;
		}

		// 오른쪽 위 - 왼쪽아래 대각선 빙고 체크
		// 04 13 22 31 40
		boolean bingo2 = true;
		for (int i = 0; i < 5; i++) {
			if (board[i][4 - i] != -1) {
				bingo2 = false;
			}
		}
		if (bingo2 == true) {
			bingoCnt++;
		}

		return bingoCnt;

	}

}
