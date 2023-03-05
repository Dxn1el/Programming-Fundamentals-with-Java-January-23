package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        List<String> commands = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());

        while (!commands.get(0).equals("Done")) {
            String commandGiven = commands.get(0);
            switch (commandGiven){
                case"Add Book":
                    String bookToAdd=commands.get(1);
                    if(!books.contains(bookToAdd)){
                        books.add(0,bookToAdd);
                    }
                    break;
                case"Take Book":
                    String bookToTake=commands.get(1);
                    books.remove(bookToTake);
                    break;
                case"Swap Books":
                    String firstBooktoSwap=commands.get(1);
                    String secondBooktoSwap=commands.get(2);
                    if(books.contains(firstBooktoSwap)&&books.contains(secondBooktoSwap)){
                        int indexOfFirstBook=books.indexOf(firstBooktoSwap);
                        int indexOfSecondBook=books.indexOf(secondBooktoSwap);
//                        books.remove(firstBooktoSwap);
//                        books.remove(secondBooktoSwap);
//                        books.add(indexOfFirstBook,secondBooktoSwap);
//                        books.add(indexOfSecondBook,firstBooktoSwap);
                        books.set(indexOfFirstBook,secondBooktoSwap);
                        books.set(indexOfSecondBook,firstBooktoSwap);
                    }
                    break;
                case"Insert Book":
                    String bookToInsert=commands.get(1);
                    if(!books.contains(bookToInsert)){
                        books.add(bookToInsert);
                    }
                    break;
                case"Check Book":
                    int index=Integer.parseInt(commands.get(1));
                    if(index>=0&&index<=books.size()-1){
                        System.out.println(books.get(index));
                    }
                    break;
            }

            commands = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        }
        System.out.println(String.join(", ",books));


    }
}
