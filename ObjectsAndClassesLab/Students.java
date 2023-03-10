package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    static class Student {
        String firstName;
        String secondName;
        String age;
        String town;

        public Student(String firstName, String secondName, String age, String town) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<Student> student = new ArrayList<>();
        while (!command.get(0).equals("end")) {
            String firstName = command.get(0);
            String secondName = command.get(1);
            String age = command.get(2);
            String town = command.get(3);
            Student stu = new Student(firstName, secondName, age, town);
            student.add(stu);

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        String town = scanner.nextLine();
        for (Student student1 : student) {

            if(town.equals(student1.getTown())){
                System.out.printf("%s %s is %s years old%n",student1.getFirstName(),student1.getSecondName(),student1.getAge());
            }
        }
    }
}
