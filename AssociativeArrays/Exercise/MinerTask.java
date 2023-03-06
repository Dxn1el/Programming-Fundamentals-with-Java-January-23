package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> resoursesMap = new LinkedHashMap<>();
        int counter = 1;
        String material = "";
        while (!input.equals("stop")) {
            if (counter % 2 == 0) {
                int inputNumber = Integer.parseInt(input);
                int currentQantity = resoursesMap.get(material);
                resoursesMap.put(material, currentQantity + inputNumber);
                counter++;
            } else {
                resoursesMap.putIfAbsent(input, 0);
                counter++;
                material = input;

            }
            input = scanner.nextLine();
        }
        resoursesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
