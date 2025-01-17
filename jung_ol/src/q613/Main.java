package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		Student s1 = new Student(name, school, grade);
		sc.close();
		
		s1.printInfo();
	}
}
