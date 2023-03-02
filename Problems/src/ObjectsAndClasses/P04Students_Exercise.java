package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04Students_Exercise {
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public double getGrade() {
            return this.grade;
        }

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ": " + grade;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> studentList  = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String data = scan.nextLine();
            String firstName = data.split(" ")[0];
            String lastName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);
            Student newStudent = new Student(firstName, lastName, grade);

            studentList.add(newStudent);

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {

            System.out.printf("%s %s: %.2f%n",student.firstName,student.lastName,student.grade);

        }
    }
}
