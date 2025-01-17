package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Jejuelementary", 6);
		
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		Student s2 = new Student(school, grade);
		sc.close();
		
		s1.printInfo();
		s2.printInfo();
	}
}
