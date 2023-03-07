package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> companyMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String company = input.split(" -> ")[0];
            String employee = input.split(" -> ")[1];
            if(!companyMap.containsKey(company)){
                companyMap.put(company,new ArrayList<>());
                companyMap.get(company).add(employee);
            }else{
                if(!companyMap.get(company).contains(employee)){
                    companyMap.get(company).add(employee);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            for (String value : entry.getValue()) {
                System.out.printf("-- %s%n",value);
            }
        }

    }
}
