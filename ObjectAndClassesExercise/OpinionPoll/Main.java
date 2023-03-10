package ObjectAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<object.Person> people = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String person = scanner.nextLine();
            String name = person.split(" ")[0];

            int age = Integer.parseInt(person.split(" ")[1]);
            if (age > 30) {
                object.Person person1= new object.Person(name,age);
                people.add(person1);
            }
        }
        for (object.Person person : people) {
            System.out.printf("%s - %d%n",person.getName(),person.getAge());
        }

    }
}
