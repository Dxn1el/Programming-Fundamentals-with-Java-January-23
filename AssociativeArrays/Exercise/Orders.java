package AssociativeArrays.Exercise;

import java.util.*;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<Double>> productsMap=new LinkedHashMap<>();


        String input = scanner.nextLine();




        
        while (!input.equals("buy")) {
            String product= input.split("\\s+")[0];
            double productPrice= Double.parseDouble(input.split("\\s+")[1]);
            double productQuantiy= Double.parseDouble(input.split("\\s+")[2]);
            if(productsMap.containsKey(product)){
                productsMap.get(product).set(0,productPrice);
                double lastQuantity= productsMap.get(product).get(1);
                productsMap.get(product).set(1,productQuantiy+lastQuantity);
            }else{
                productsMap.putIfAbsent(product,new ArrayList<>());
                productsMap.get(product).add(productPrice);
                productsMap.get(product).add(productQuantiy);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productsMap.entrySet()) {
            List<Double> values= entry.getValue();
            double price= values.get(0);
            double quantity=values.get(1);
           double sum= quantity*price;
            System.out.printf("%s -> %.2f%n",entry.getKey(), sum);
        }
    }
}
