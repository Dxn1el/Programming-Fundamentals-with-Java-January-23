package ObjectAndClassesExercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<peopleClass.PeopleInfo> people = new ArrayList<>();

        while (!"End".equals(input)) {
            String name = input.split(" ")[0];
            String ID = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            peopleClass.PeopleInfo person = new peopleClass.PeopleInfo(name, ID, age);

            people.add(person);
            input = scanner.nextLine();
        }
        people.sort(Comparator.comparing(peopleClass.PeopleInfo::getAge));
        for (peopleClass.PeopleInfo person : people) {
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(),person.getID(),person.getAge());
        }
    }
}
