package TextProcessing.Exercise;

import java.util.*;

public class CharacterMultiplier {
    public static boolean biggerWord(String firstWord, String secondWord){
        if(firstWord.length()>secondWord.length()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        String firstWord = words[0];
        String secondWord = words[1];

        int shorterWord = Math.min(firstWord.length(), secondWord.length());
        int longerWord = Math.max(firstWord.length(), secondWord.length());
        int sum = 0;

        for (int i = 0; i < shorterWord; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }
        if(firstWord.length()==secondWord.length()){
            System.out.print(sum);
            return;
        }
        //Ако първата дума е по голяма
        if(biggerWord(firstWord,secondWord)){
            for (int i = shorterWord; i <firstWord.length() ; i++) {
                sum+=firstWord.charAt(i);
            }
        }else{
            for (int i = shorterWord; i <secondWord.length() ; i++) {
                sum+=secondWord.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
//multiply str1[0] with str2[0] and add to the total sum