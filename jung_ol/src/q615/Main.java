package q615;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
	    s.name1 = sc.next();
	    s.kor1 = sc.nextInt();
	    s.eng1 = sc.nextInt();
	    s.name2 = sc.next();
	    s.kor2 = sc.nextInt();
	    s.eng2 = sc.nextInt();
	    sc.close();
	    
	    System.out.println(s.name1 + " " + s.kor1 + " " + s.eng1);
	    System.out.println(s.name2 + " " + s.kor2 + " " + s.eng2);
	    int avgkor = (int)(s.kor1+s.kor2)/2;
	    int avgeng = (int)(s.eng1+s.eng2)/2;
	    System.out.println("avg "+avgkor+ " "+avgeng);
	}
}