package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> friends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int lostNamesCounter = 0;
        int blacklistCounter=0;

        while (!command.get(0).equals("Report")) {

            String commandGiven = command.get(0);
            switch (commandGiven) {
                case "Blacklist":
                    String nameToBlacklist = command.get(1);
                    boolean flag = true;
                    for (int i = 0; i < friends.size(); i++) {
                        if (friends.get(i).equals(nameToBlacklist)) {
                            String blacklistedFriend = friends.get(i);
                            friends.remove(i);
                            friends.add(i, "Blacklisted");
                            System.out.printf("%s was blacklisted.%n", blacklistedFriend);
                            flag = false;
                            blacklistCounter++;

                        }
                    }
                    if (flag) {
                        System.out.printf("%s was not found.%n", nameToBlacklist);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command.get(1));
                    if (index >= 0 && index <= friends.size() - 1) {
                        String lostName = friends.get(index);
                        if (!((lostName.equals("Blacklisted") || lostName.equals("Lost")))) {
                            friends.remove(index);
                            friends.add(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", lostName);
                            lostNamesCounter++;
                        }
                    }
                    break;
                case "Change":
                    int indexGiven = Integer.parseInt(command.get(1));
                    String newName = command.get(2);
                    if (indexGiven >= 0 && indexGiven <= friends.size() - 1) {
                        String lastName = friends.get(indexGiven);
                        friends.remove(indexGiven);
                        friends.add(indexGiven, newName);
                        System.out.printf("%s changed his username to %s.%n", lastName, newName);
                    }
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }

        System.out.println("Blacklisted names: "+blacklistCounter);
        System.out.println("Lost names: "+lostNamesCounter);
        System.out.println(String.join(" ",friends));
    }


}


