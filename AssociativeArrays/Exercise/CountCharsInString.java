package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> wordsMap = new LinkedHashMap<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (wordsMap.containsKey(c)) {
                int value = wordsMap.get(c);
                wordsMap.put(c, value + 1);
            } else {
                wordsMap.put(c, 1);
            }
        }
        wordsMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
