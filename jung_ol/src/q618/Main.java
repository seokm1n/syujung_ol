package q618;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Person> people= new ArrayList<>();

      for (int i=0; i<5; i++) {
         String name = sc.next();
         int height = sc.nextInt();
         double weight = sc.nextDouble();      
         people.add(new Person(name,height,weight));
      }
      
      sc.close();
      
      people.sort(Comparator.comparing(p -> p.name));  // 이름 기준 정렬
      System.out.println("name");
      for (Person p : people) {
         System.out.print(p.name + " " + p.height +" "+p.weight);
         System.out.println();
      }
      System.out.println();
      
      people.sort(Comparator.comparingDouble(Person::getweight).reversed());
      System.out.println("weight");
      for (Person p : people) {
         System.out.print(p.name + " " + p.height +" "+p.weight);
         System.out.println();
      }
   }

}

class Person {
   public String name;
   public int height;
   public double weight;

   Person(String name, int height, double weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
   }
   
   public double getweight() {
      return this.weight;
   }
}