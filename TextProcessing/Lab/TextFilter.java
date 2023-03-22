package TextProcessing.Lab;

import java.util.*;

public class TextFilter {
    public static String censured (String word){
        StringBuilder censuredWord= new StringBuilder();

        for (int i = 0; i <word.length() ; i++) {
            censuredWord.append("*");
        }
        String result= String.valueOf(censuredWord);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
           text= text.replaceAll(bannedWord,censured(bannedWord));
        }
        System.out.println(text);
    }

}
