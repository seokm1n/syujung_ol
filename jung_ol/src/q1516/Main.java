package q1516;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equals("END")) {
                break;
            }

            HashMap<String, Integer> wordCounts = new HashMap<>();

            String[] words = line.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }

            ArrayList<String> keys = new ArrayList<>(wordCounts.keySet());
            Collections.sort(keys);

            for (int i = 0; i < keys.size(); i++) {
                String word = keys.get(i);
                int count = wordCounts.get(word);
                System.out.println(word + " : " + count);
            }
        }
        scanner.close();
    }
}
