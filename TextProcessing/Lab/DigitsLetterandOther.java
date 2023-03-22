package TextProcessing.Lab;

import java.util.*;

public class DigitsLetterandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //53453
        //AgdDfgF
        //#^&

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else if (Character.isLetter(c)) {
                letters.append(c);
            } else {
                other.append(c);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
