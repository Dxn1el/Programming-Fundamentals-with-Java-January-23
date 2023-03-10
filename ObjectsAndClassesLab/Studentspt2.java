package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Studentspt2 {
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

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static boolean studentExists(List<Student> students, String firstName, String secondName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return true;
            }

        }
        return false;
    }

    public static Integer getIndex(List<Student> students, String firstName, String secondName) {
        int index=-1;
        for (int i = 0; i < students.size(); i++) {
            for (Student student : students) {
                if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                    index=i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<Student> Students = new ArrayList<>();

        while (!command.get(0).equals("end")) {
            String firstName = command.get(0);
            String secondName = command.get(1);
            String age = command.get(2);
            String town = command.get(3);


            if (studentExists(Students, firstName, secondName)) {
                int index= getIndex(Students, firstName, secondName);
                Students.get(index).setAge(age);
                Students.get(index).setTown(town);
            } else {
                Student student = new Student(firstName, secondName, age, town);
                Students.add(student);
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        String city = scanner.nextLine();
        for (Student student : Students) {
            if (student.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getSecondName(), student.getAge());
            }
        }
    }
}
