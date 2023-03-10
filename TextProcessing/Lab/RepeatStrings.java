package TextProcessing.Lab;
import java.util.*;
public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input= scanner.nextLine().split("\\s+");
        StringBuilder result= new StringBuilder();
        for (String s : input) {
            for (int i = 0; i <s.length() ; i++) {
                result.append(s);
            }
        }
        System.out.println(result);
    }
}
