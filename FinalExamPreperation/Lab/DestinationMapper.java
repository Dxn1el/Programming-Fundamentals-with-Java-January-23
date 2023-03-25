package FinalExamPreperation.Lab;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> destinations = new ArrayList<>();
        int travelPoints=0;

        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));

        }
        StringBuilder matcherPointsCompiler= new StringBuilder();
        destinations.forEach(entry->matcherPointsCompiler.append(entry));
        for (char c : matcherPointsCompiler.toString().toCharArray()) {
            travelPoints++;
        }
        System.out.println("Destinations: "+String.join(", ",destinations));
        System.out.printf("Travel Points: %d",travelPoints);

    }
}
