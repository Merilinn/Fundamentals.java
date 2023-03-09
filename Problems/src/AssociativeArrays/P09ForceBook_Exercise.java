package AssociativeArrays;

import java.util.*;

public class P09ForceBook_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String command = "";
        boolean isThere = false;
        Map<String, List<String>> forceMap = new LinkedHashMap<>();
        while (!input.contains("Lumpawaroo")) {
            if (input.contains("|")) {
                command = "add";
            } else if (input.contains("->")) {
                command = "replace";
            }
            switch (command) {
                case "add":
                    String side = input.split(" \\| ")[0];
                    String user = input.split(" \\| ")[1];

                    forceMap.putIfAbsent(side, new ArrayList<>());
                    if (!forceMap.get(side).contains(user)) {
                        for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
                            if (entry.getValue().contains(user)) {
                                isThere = true;
                                break;
                            }
                        }
                        if (!isThere) {
                            forceMap.get(side).add(user);
                        }
                    }
                    break;
                case "replace":
                    isThere = false;
                    side = input.split(" -> ")[1];
                    user = input.split(" -> ")[0];
                    for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
                        if (entry.getValue().contains(user)) {
                            entry.getValue().remove(user);
                            isThere = true;
                            break;
                        }
                    }
                    if (isThere) {
                        forceMap.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    } else if (!forceMap.containsKey(side)) {
                        forceMap.put(side, new ArrayList<>());
                        forceMap.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    } else {
                        forceMap.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
            if (entry.getValue().size() >= 1){
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("! %s%n", entry.getValue().get(i));

                }
            }
        }

    }
}
