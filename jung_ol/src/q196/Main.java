package q196;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            String tel = sc.next();
            String addr = sc.next();
            people.add(new Person(name, tel, addr));
        }

        sc.close();

        people.sort(Comparator.comparing(p -> p.name)); // 이름 기준 정렬
        
        Person first = people.get(0); // 첫 번째 사람 가져오기
        System.out.println("name : " + first.name);
        System.out.println("tel : " + first.tel);
        System.out.println("addr : " + first.addr);
    }
}

class Person {
    public String name;
    public String tel;
    public String addr;

    Person(String name, String tel, String addr) {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }
}