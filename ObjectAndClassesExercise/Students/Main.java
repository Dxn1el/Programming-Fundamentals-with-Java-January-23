package ObjectAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        List<StudentsClass.Student> studentsList=new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String secondName = input.split(" ")[1];
            Double grade = Double.parseDouble(input.split(" ")[2]);
            StudentsClass.Student student = new StudentsClass.Student(firstName, secondName, grade);
            studentsList.add(student);
        }
studentsList.sort(Comparator.comparing(StudentsClass.Student::getGrade).reversed());
        for (StudentsClass.Student student : studentsList) {
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getSecondName(),student.getGrade());
        }
    
    }
}
