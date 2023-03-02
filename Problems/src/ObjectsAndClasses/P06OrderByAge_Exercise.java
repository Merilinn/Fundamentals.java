package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P06OrderByAge_Exercise {
    static class PersonData{
        String name;
        String ID;
        int age;

        public int getAge() {
            return this.age;
        }

        public PersonData(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;


        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List <PersonData> personList = new ArrayList<>();
        while (!input.equals("End")){
            String name = input.split(" ")[0];
            String ID = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            PersonData personToAdd = new PersonData(name, ID, age);
            personList.add(personToAdd);
            input = scan.nextLine();
        }
      personList.sort(Comparator.comparing(PersonData::getAge));
        for (PersonData person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.name, person.ID, person.getAge());

        }
    }
}
