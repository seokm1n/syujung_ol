package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		
		int BMI = weight + 100 - height;
		System.out.println(BMI);
		if (BMI > 0)
			System.out.println("Obesity");
	}
}
