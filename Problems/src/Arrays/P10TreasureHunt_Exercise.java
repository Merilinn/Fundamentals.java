package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class P10TreasureHunt_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lootList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!commandList.contains("Yohoho!")) {
            if (commandList.contains("Loot")) {
                while (commandList.size() > 1) {
                    String newLoot = commandList.get(1);
                    if (!lootList.contains(newLoot)) {
                        lootList.add(0, newLoot);
                        commandList.remove(1);
                    } else {
                        commandList.remove(1);
                    }
                }
            } else if (commandList.contains("Drop")) {
                int index = Integer.parseInt(commandList.get(1));
                if (index >= 0 && index <= lootList.size() - 1) {
                    lootList.add(lootList.get(index));
                    lootList.remove(lootList.get(index));
                } else {
                    commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
                    continue;
                }
            } else if (commandList.contains("Steal")) {
                int count = Integer.parseInt(commandList.get(1));
                List <String> stealList = new ArrayList<>();
                if (count <= lootList.size()) {
                    while (count != 0) {
                        String lastElement = lootList.get(lootList.size()-1);
                        stealList.add(lastElement);
                        lootList.remove(lootList.size() - 1);
                        count--;
                    }

                } else {
                    count = lootList.size();
                    while (count != 0) {
                        String lastElement = lootList.get(lootList.size()-1);
                        stealList.add(lastElement);
                        lootList.remove(lootList.size() - 1);
                        count--;
                    }
                }
                Collections.reverse(stealList);
                System.out.println(String.join(", ", stealList));
            }
            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        if (lootList.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            int sum = 0;
            double count = 0;
            for (int i = 0; i < lootList.size(); i++) {
                String currentElement = lootList.get(i);
                sum += currentElement.length();
                count = i+1;
            }
            double total = sum / count;
            System.out.printf("Average treasure gain: %.2f pirate credits.", total);
        }
    }
}
