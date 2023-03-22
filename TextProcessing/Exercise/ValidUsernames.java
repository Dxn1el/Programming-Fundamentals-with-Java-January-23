package TextProcessing.Exercise;
import java.util.*;
public class ValidUsernames {
    public static Boolean lenghtValidation(String name) {
        if (name.length() >= 3 && name.length() <= 16) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean charsValidation(String name) {
        for (char c : name.toCharArray()) {
            if (!(c == '-' || Character.isLetter(c) || Character.isDigit(c) || c == '_')) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if(lenghtValidation(username) && charsValidation(username)){
                System.out.println(username);
            }
        }
    }
}
