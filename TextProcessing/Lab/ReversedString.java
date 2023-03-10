package TextProcessing.Lab;

import java.util.*;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder result = new StringBuilder();
            for (int i = input.length()-1; i >= 0; i--) {
                char[] text = input.toCharArray();
                result.append(text[i]);
            }
            System.out.printf("%s = %s%n",input,result);
            input = scanner.nextLine();
        }
    }
}
