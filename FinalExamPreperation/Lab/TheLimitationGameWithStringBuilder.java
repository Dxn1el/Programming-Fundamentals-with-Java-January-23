package FinalExamPreperation.Lab;
import java.util.*;
public class TheLimitationGameWithStringBuilder {
private static void move(StringBuilder encryptedMessage,int index){
    String appendToBuilder=encryptedMessage.substring(0,index);
    encryptedMessage.replace(0,index,"");
    encryptedMessage.append(appendToBuilder);
}
private static void insert(StringBuilder encryptedMessage,int index, String insert){
    encryptedMessage.insert(index,insert);
}
private static void changeAll(StringBuilder encryptedMessage, String replaceAll, String replaceWith){
    encryptedMessage.replace(0,encryptedMessage.length(),encryptedMessage.toString().replace(replaceAll,replaceWith));
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
            String input = scanner.nextLine();

            while (!input.equals("Decode")) {
                String[] commands = input.split("\\|");
                String command = commands[0];
                switch (command) {
                    case "Move":
                        //o	Moves the first n letters to the back of the strig -> Move|3
                       move(encryptedMessage,Integer.parseInt(commands[1]));

                        break;
                    case "Insert":
                        //o	Inserts the given value before the given index in the string -> Insert|2|o
                        insert(encryptedMessage,Integer.parseInt(commands[1]),commands[2]);
                        break;
                    case "ChangeAll":
                        changeAll(encryptedMessage,commands[1],commands[2]);
                        // Changes all occurrences of the given substring with the replacement text -> ChangeAll|z|l

                }

                input = scanner.nextLine();
            }
            System.out.printf("The decrypted message is: %s",encryptedMessage);

        }
    }


