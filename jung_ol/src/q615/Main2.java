package q615;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 수:");
        int numOfStudents = sc.nextInt();

        System.out.println("과목 수:");
        int numOfSubjects = sc.nextInt();

        String[] students = new String[numOfStudents];
        String[] subjects = new String[numOfSubjects];
        int[][] scores = new int[numOfStudents][numOfSubjects];

        // 과목 이름 입력
        System.out.println("과목 이름:");
        for (int i = 0; i < numOfSubjects; i++) {
            subjects[i] = sc.next();
        }

        // 학생 정보 및 점수 입력
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("학생 이름:");
            students[i] = sc.next();

            System.out.println(students[i] + "각 과목 점수:");
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // 입력된 정보 출력
        System.out.println("\n점수표:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print(students[i] + " ");
            for (int j = 0; j < numOfSubjects; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        // 과목별 평균 계산 및 출력
        System.out.println("\n과목별 평균 점수:");
        for (int j = 0; j < numOfSubjects; j++) {
            int sum = 0;
            for (int i = 0; i < numOfStudents; i++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / numOfStudents;
            System.out.println(subjects[j] + " 평균: " + avg);
        }
    }
}
