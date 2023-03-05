package AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        List<String> wordsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        for (String words : wordsList) {
            String word = words.toLowerCase();
            wordsMap.putIfAbsent(word, 0);
            int value=wordsMap.get(word);
            wordsMap.put(word, value + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", result));
    }

}
