package TextProcessing.Exercise;

import java.util.*;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charArr = input.toCharArray();
        StringBuilder result=new StringBuilder();
        for (int i = 0; i <charArr.length ; i++) {
            if(i==charArr.length-1){
                result.append(charArr[i]);
                break;
            }
            if(charArr[i]!=charArr[i+1]){
                result.append(charArr[i]);
            }
        }
        System.out.println(result);
    }
}
