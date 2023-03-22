package RegEx.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> people = Arrays.stream(input.split(", ")).collect(Collectors.toList());

        System.out.printf("1st place: %s%n",people.get(0));
        System.out.printf("2nd place: %s%n",people.get(1));
        System.out.printf("3rd place: %s%n",people.get(2));
    }
}
