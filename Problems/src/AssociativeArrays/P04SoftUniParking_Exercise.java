package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];
            if (command.equals("register")) {
                String id = input.split(" ")[2];
                if (!parkingMap.containsKey(name)) {
                    parkingMap.put(name, id);
                    System.out.printf("%s registered %s successfully%n", name, id);
                } else {
                    String currentId = parkingMap.get(name);
                    System.out.println("ERROR: already registered with plate number " + currentId);
                }
            }
            if (command.equals("unregister")) {
                if (!parkingMap.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    System.out.printf("%s unregistered successfully%n", name);
                    parkingMap.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> entry : parkingMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }
    }
}
