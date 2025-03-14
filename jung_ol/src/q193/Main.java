package q193;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] arr = new String[5];
      for (int i = 0; i < 5; i++) {
         arr[i] = sc.next();
      }
      char ch = sc.next().charAt(0);
      String str = sc.next();
      sc.close();
      

      
      int count = 0;
      for (int i = 0; i < 5; i++) {
         if (arr[i].indexOf(ch) != -1 || arr[i].contains(str)) {
            System.out.println(arr[i]);
            count++;
         }
      }
      if (count == 0) System.out.println("none");
      
   }

}
