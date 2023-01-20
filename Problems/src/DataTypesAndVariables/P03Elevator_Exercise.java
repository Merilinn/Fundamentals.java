package DataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        int courses = 0;
            courses = people / capacity;
            if (people % capacity != 0){
                courses += 1;
            }
        System.out.println(courses);

    }
}
