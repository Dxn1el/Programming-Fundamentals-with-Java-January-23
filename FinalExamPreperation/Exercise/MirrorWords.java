package FinalExamPreperation.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})(\\1)(\\1)(?<secondWord>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(input);
        int wordsFound = 0;
        int mirrorWordsFound = 0;
        List<String> mirrorWordsList = new ArrayList<>();
        while (matcher.find()) {
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            wordsFound++;
            String secondWordChecker = new StringBuilder(secondWord).reverse().toString();

            if (firstWord.equals(secondWordChecker)) {
                mirrorWordsFound++;
                mirrorWordsList.add(firstWord + " <=> " + secondWord);
            }

        }
        if (wordsFound <= 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(wordsFound + " word pairs found!");
        }
        if (mirrorWordsList.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWordsList));
        }
    }
}
