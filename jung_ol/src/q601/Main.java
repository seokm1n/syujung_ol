package q601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        for (int i = str.length()-1; i >= 0; i--) {
            for (int j = 0; j < str.length(); j++) {
            	 System.out.print(str.charAt((i + j) % str.length()));
            }
            System.out.println();
        }
    }
}