package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> guestList = new ArrayList<>();

        while (n > 0) {
            List<String> command = Arrays.asList(scan.nextLine().split(" "));

            if (command.contains("not")) {
                String name = command.get(0);
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);

                }
            } else {
                String name = command.get(0);
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);

                } else {
                    guestList.add(name);
                }
            }

            n--;
        }
        for (String names : guestList) {
            System.out.println(names);

        }
    }
}
