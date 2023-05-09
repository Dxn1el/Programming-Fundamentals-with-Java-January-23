package FinalExamPreperation.Exercise;

import java.util.*;

public class ThePianist {
    public static void handleAdd(String[] commands, Map<String, List<String>> pieceMap) {
        String piece = commands[1];
        String composer = commands[2];
        String key = commands[3];

        if (!pieceMap.containsKey(piece)) {

            List<String> pieceList = new ArrayList<>();
            pieceList.add(composer);
            pieceList.add(key);
            pieceMap.put(piece, pieceList);
            System.out.println(piece + " by " + composer + " in " + key + " added to the collection!");
        } else {
            System.out.println(piece + " is already in the collection!");
        }
    }

    public static void handleRemove(String[] commands, Map<String, List<String>> pieceMap) {
        String piece = commands[1];
        if (!pieceMap.containsKey(piece)) {
            System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
        } else {
            pieceMap.remove(piece);
            System.out.println("Successfully removed " + piece + "!");
        }
    }

    public static void handleChangeKey(String[] commands, Map<String, List<String>> pieceMap) {
        String piece = commands[1];
        String key = commands[2];
        if (!pieceMap.containsKey(piece)) {
            System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
        } else {
            String lastPiece = pieceMap.get(piece).get(0);
            pieceMap.get(piece).set(1, key);
            System.out.println("Changed the key of " + piece + " to " + key + "!");
        }

    }

    public static void handlePrinting(Map<String, List<String>> pieceMap) {


        pieceMap.entrySet().forEach(a -> System.out.println(a.getKey() + " -> " + "Composer: " + a.getValue().get(0) + ", Key: " + a.getValue().get(1)));

    }

    public static void handleFillingMap(String piece, String composer, String key, Map<String, List<String>> pieceMap) {
        List<String> pieceList = new ArrayList<>();
        pieceList.add(composer);
        pieceList.add(key);
        pieceMap.put(piece, pieceList);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieceMap = new LinkedHashMap<>();

        for (int i = 0; i < counter; i++) {

            String[] input = scanner.nextLine().split("\\|");
            handleFillingMap(input[0], input[1], input[2], pieceMap);

        }
        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] commands = input.split("\\|");


            switch (commands[0]) {
                case "Add":
                    handleAdd(commands, pieceMap);
                    break;
                case "Remove":
                    handleRemove(commands, pieceMap);
                    break;
                case "ChangeKey":
                    handleChangeKey(commands, pieceMap);
                    break;
            }
            input = scanner.nextLine();
        }

        handlePrinting(pieceMap);
    }
}


