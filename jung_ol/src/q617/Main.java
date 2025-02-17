package q617;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        
        for (int i = 0; i < 5; i++) {
            p.name[i] = sc.next();
            p.height[i] = sc.nextInt();
        }
        p.min();
        sc.close();
    }
}

class Person {
    public String[] name = new String[5];
    public int[] height = new int[5];

    public void min() {
        int minHeight = Integer.MAX_VALUE;
        String minName = "";
        
        for (int i = 0; i < 5; i++) {
            if (height[i] < minHeight) {
                minHeight = height[i];
                minName = name[i];
            }
        }
        
        System.out.printf("%s %d", minName, minHeight);
    }
}
