package RegEx.Lab;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    //+359 2 222 2222
    //+359-2-222-2222
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);
        List<String> validNumbers= new ArrayList<>();
        while(matcher.find()){
            validNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ",validNumbers));
    }
}
