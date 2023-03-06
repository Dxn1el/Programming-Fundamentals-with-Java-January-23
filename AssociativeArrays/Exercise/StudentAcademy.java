package AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        Map<String, Double> academyMap = new LinkedHashMap<>();

        for (int i = 0; i < counter; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (!academyMap.containsKey(name)) {
                academyMap.put(name, grade);
            }else{
                double currentGrade= academyMap.get(name);
                academyMap.put(name,(currentGrade+grade)/2);
            }
        }
        academyMap.entrySet().stream().filter(entry -> entry.getValue() >= 4.5).forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
