package AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).collect(Collectors.toList());
        for (String s : wordsList) {
            System.out.println(s);
        }
    }
}
