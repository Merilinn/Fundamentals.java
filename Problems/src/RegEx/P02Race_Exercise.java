package RegEx;

import java.util.*;
import java.util.stream.Collectors;

public class P02Race_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> people = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end of race")) {
            input = scan.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.printf("1st place: %s%n", people.get(i));
            } else if (i == 1) {
                System.out.printf("2nd place: %s%n", people.get(i));
            } else {
                System.out.printf("3rd place: %s%n", people.get(i));
            }
        }
    }
}
