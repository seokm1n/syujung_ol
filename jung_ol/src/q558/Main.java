package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
            arr[idx] = sc.nextInt();

            if (arr[idx++]== 0) {
        		sc.close();
                break;
            }
        }
		
		for(int i=idx-2;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
