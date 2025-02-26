package q9129;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = "";
      for (int i = 0; i < 3; i++) {
         String num = String.format("%.2f", sc.nextDouble());
         str += num;
      }
      sc.close();
      
      for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (ch == '.') {
              System.out.println();
          } else {
              System.out.print(ch);
          }
      }
   }

}
