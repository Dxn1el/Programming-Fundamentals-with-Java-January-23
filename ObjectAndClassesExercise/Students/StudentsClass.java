package ObjectAndClassesExercise.Students;

public class StudentsClass {
    static class Student {
        //"{first name} {second name} {grade}".
        String firstName;
        String secondName;
        Double grade;

        public Student(String firstName, String secondName, Double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName = firstName;
        }

        public String getSecondName() {
            return this.secondName = secondName;
        }

        public Double getGrade() {
            return this.grade = grade;
        }


    }
}
