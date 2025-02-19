package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10]; // Integer[] 배열 사용

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt(); // 입력받기
        }

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " "); // 결과 출력
        }

        sc.close(); // Scanner 닫기
    }
}
