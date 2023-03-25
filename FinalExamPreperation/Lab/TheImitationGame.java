package FinalExamPreperation.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class TheImitationGame {
    private static String move(String encryptedMessage, int move) {
        String substringPart1 = encryptedMessage.substring(0, move);
        String substringPart2 = encryptedMessage.substring(move);
        encryptedMessage = substringPart2 + substringPart1;
        return encryptedMessage;
    }

    private static String insert(String encryptedMessage, int index, String insertSubstring) {
        String firstPart = encryptedMessage.substring(0, index);
        String secondPart = encryptedMessage.substring(index);
        encryptedMessage = firstPart + insertSubstring + secondPart;
        return encryptedMessage;
    }

    private static String changeAll(String encryptedMessage, String replaceAll, String replaceWith) {
        return encryptedMessage.replace(replaceAll,replaceWith);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] commands = input.split("\\|");
            String command = commands[0];
            switch (command) {
                case "Move":
                    //o	Moves the first n letters to the back of the strig -> Move|3
                    encryptedMessage = move(encryptedMessage, Integer.parseInt(commands[1]));

                    break;
                case "Insert":
                    //o	Inserts the given value before the given index in the string -> Insert|2|o
                    encryptedMessage = insert(encryptedMessage, Integer.parseInt(commands[1]), commands[2]);

                    break;
                case "ChangeAll":
                    // Changes all occurrences of the given substring with the replacement text -> ChangeAll|z|l
                    encryptedMessage = changeAll(encryptedMessage, commands[1], commands[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command: " + command);
            }

            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);

    }
}
