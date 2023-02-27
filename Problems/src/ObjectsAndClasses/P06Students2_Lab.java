package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2_Lab {
    static class Students{
        String firstName;
        String lastName;
        String age;
        String town;

        public Students(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Students> studentList = new ArrayList<>();
        while (!input.equals("end")){
            String[] inputArr = input.split(" ");
            String firstname = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String town = inputArr[3];

            Students currentStudent = new Students(firstname, lastName, age, town);
            studentList.add(currentStudent);


            input = scan.nextLine();

        }
        String town = scan.nextLine();
        List <Students> equalTownStudentsList = new ArrayList<>();
        for (Students student : studentList) {
            if (student.getTown().equals(town)){
                equalTownStudentsList.add(student);
            }
        }
        for (int i = 0; i < equalTownStudentsList.size(); i++) {
            Students student = equalTownStudentsList.get(i);
            if (i + 1 == equalTownStudentsList.size()){
                break;
            }
            Students nextStudent = equalTownStudentsList.get(i+1);
            if (student.getFirstName().equals(nextStudent.firstName) && student.getLastName().equals(nextStudent.getLastName())){
                equalTownStudentsList.set(i, nextStudent);
                equalTownStudentsList.remove(i+1);
            }



        }
        for (Students student : equalTownStudentsList) {
            System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());

        }
    }
}
