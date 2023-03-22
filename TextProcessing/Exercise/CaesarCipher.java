package TextProcessing.Exercise;

import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        char[] charArr= input.toCharArray();
        StringBuilder result= new StringBuilder();

        for (int i = 0; i <charArr.length ; i++) {
            int charValue=charArr[i]+3;
            result.append((char)charValue);
        }
        System.out.println(result);
    }
//Programming is cool! -> Surjudpplqj#lv#frro$
}
