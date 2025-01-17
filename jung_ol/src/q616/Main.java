package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle t = new Triangle();
		for (int i = 0; i < 6; i++) {
			t.point[i]=sc.nextInt();
		}
		t.getCenter();
		sc.close();
	}
}

class Triangle {
	public int[] point = new int[6];

	public void getCenter() {
		double x = 0;
		double y = 0;
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0)
				x += point[i];
			else
				y += point[i];
				
		}
		System.out.printf("(%.1f, %.1f)",x/3,y/3);
	}
}