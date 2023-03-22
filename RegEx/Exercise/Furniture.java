package RegEx.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //">>{furniture name}<<{price}!{quantity}"
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]*)<<(?<furniturePrice>[0-9]+\\.?[0-9]*)!(?<furnitureQuantity>[0-9]+)");
        List<String> furnitureBought = new ArrayList<>();
        double totalSum = 0.0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double furniturePrice = Double.parseDouble(matcher.group("furniturePrice"));
                int furnitureQuanity = Integer.parseInt(matcher.group("furnitureQuantity"));
                furnitureBought.add(furnitureName);
                double sumOfPurchase = furniturePrice * furnitureQuanity;
                totalSum += sumOfPurchase;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureBought.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
