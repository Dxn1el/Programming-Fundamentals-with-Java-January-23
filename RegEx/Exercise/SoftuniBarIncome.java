package RegEx.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0.0;
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|%$.]*?<(?<product>\\w+)>[^|%$.]*?\\|(?<count>[0-9]+)\\|[^|%$.]*?(?<price>[0-9]+\\.?[0-9]+)\\$");
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            //•	Print all the valid lines in the format "{customerName}: {product} - {totalPrice}".
            if(matcher.find()){
                String customerName=matcher.group("name");
                String product= matcher.group("product");
                int count=Integer.parseInt(matcher.group("count"));
                double price= Double.parseDouble(matcher.group("price"));
                double sum= count*price;
                System.out.printf("%s: %s - %.2f%n",customerName,product,sum);
                totalSum+=sum;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f" , totalSum);
    }
}
