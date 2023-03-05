package AssociativeArrays.Lab;

import java.util.*;

public class WordSynonims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        int repetitions = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repetitions; i++) {
            String word = scanner.nextLine();
            String synonim = scanner.nextLine();
            wordsMap.putIfAbsent(word, new ArrayList<>());
            wordsMap.get(word).add(synonim);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}



