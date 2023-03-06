package AssociativeArrays.Exercise;

import java.util.*;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();
        for (int i = 0; i < commands; i++) {
            String input = scanner.nextLine();
            String register = input.split("\\s+")[0];
            if (register.equals("register")) {
                String username = input.split("\\s++")[1];
                String plate = input.split("\\s+")[2];

                if (parking.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                } else {
                    parking.put(username, plate);
                    System.out.printf("%s registered %s successfully%n", username, plate);
                }
            } else if (register.equals("unregister")) {
                String username = input.split("\\s+")[1];
                if (!parking.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parking.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        parking.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
