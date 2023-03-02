package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll_Exercise {
    static class Person{
        String name;
        int age;

        @Override
        public String toString() {
            return name + " - " + age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List <Person> personList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String data = scan.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if (age > 30){
            Person newPerson = new Person(name, age);
            personList.add(newPerson);}
        }
        for (Person person : personList) {
            System.out.println(person);

        }
    }
}
