package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0);
        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine().toLowerCase();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i < inputData.length; i += 2) {

                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1];


                if (!items.containsKey(material)) {
                    items.put(material, quantity);
                } else {
                    int lastFragments = items.get(material);
                    items.put(material, quantity + lastFragments);
                }

                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int lastFragment = items.get("shards");
                    items.put("shards", lastFragment - 250);
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int lastFragment = items.get("fragments");
                    items.put("fragments", lastFragment - 250);
                    isWin = true;
                    break;

                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int lastFragment = items.get("motes");
                    items.put("motes", lastFragment - 250);
                    isWin = true;
                    break;

                }

            }
        }
        items.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }

}

