package RegEx.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<user>[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+)@(?<host>[A-Za-z]+[/-]?[A-Za-z]+)(\\.[A-Za-z]+)+");

        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
