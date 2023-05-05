package FinalExamPreperation.Exercise;

import java.util.*;

public class WorldTour {
    public static boolean handleIndexValidation(int index, StringBuilder sb) {
        return index >= 0 && index < sb.length();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinationsInput = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder destinations = new StringBuilder(destinationsInput);
        while (!input.equals("Travel")) {
            String[] commandsGiven = input.split(":");
            String command = commandsGiven[0];
            switch (command) {
                case "Add Stop":
                    //	Insert the given string at that index only if the index is valid
                    //	"Add Stop:{index}:{string}":
                    int index = Integer.parseInt(commandsGiven[1]);
                    String newStop = commandsGiven[2];
                    if (handleIndexValidation(index, destinations)) {
                        destinations.insert(index, newStop);
                    }
                    break;
                case "Remove Stop":
                    //	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
                    int startIndex = Integer.parseInt(commandsGiven[1]);
                    int endIndex = Integer.parseInt(commandsGiven[2]);
                    if (handleIndexValidation(startIndex, destinations) && handleIndexValidation(endIndex, destinations)) {
                        destinations.delete(startIndex, endIndex + 1);

                    }
                    break;
                case "Switch":
                    //	If the old string is in the initial string, replace it with the new one (all occurrences)
                    String oldString = commandsGiven[1];
                    String newString = commandsGiven[2];

                    if (destinations.toString().contains(oldString)) {
                        String temp = destinations.toString().replace(oldString, newString);
                        destinations = new StringBuilder(temp);
                    }
                    break;
            }
            System.out.println(destinations);


            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", destinations);
        // After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"
    }
}
