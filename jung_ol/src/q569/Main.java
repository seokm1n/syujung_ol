package q569;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] arr = new int[5][4];
      for (int i = 0; i < 5; i++) {
    	  for (int j = 0; j < 4; j++) {
    		  arr[i][j] = sc.nextInt();
    	  }
      }
      sc.close();
      
      int[]	sum = new int[5];
      for (int i = 0; i < 5; i++) {
    	  for (int j = 0; j < 4; j++) {
    		  sum[i] += arr[i][j];
    	  }
      }
      
      int count = 0;
      for (int i = 0; i < 5; i++) {
    	  if (sum[i] / 4 >= 80) {
    		  System.out.println("pass");
    		  count++;
    	  }
    	  else {
    		  System.out.println("fail");
    	  }
      }
      System.out.printf("Successful : " + count);
   }
}