package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        for (int i = 0; i < wordsList.size() ; i++) {
            Random rnd=new Random();
        int index1=rnd.nextInt(wordsList.size());
        int index2=rnd.nextInt(wordsList.size());
        String temp1=wordsList.get(index1);
        String temp2=wordsList.get(index2);
        wordsList.set(index2,temp1);
        wordsList.set(index1,temp2);

        }
        for (String s : wordsList) {
            System.out.println(s);
        }
    }
}
