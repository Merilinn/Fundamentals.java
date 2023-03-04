package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class P07LegendaryFarming_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scan.nextLine().toLowerCase().split(" ")).collect(Collectors.toList());

        Map<String, Integer> legendaryMap = new LinkedHashMap<>();

        int totalValue = 0;
        String legendaryKey = "";
        while (totalValue <= 249) {

            for (int i = 0; i < inputList.size(); i = i + 2) {

                int currentValue = Integer.parseInt(inputList.get(i));
                String currentItem = inputList.get(i + 1);

                if (currentItem.equals("shards") || currentItem.equals("motes") || currentItem.equals("fragments")) {
                    if (!legendaryMap.containsKey(currentItem)) {
                        legendaryMap.put(currentItem, currentValue);
                        totalValue = legendaryMap.get(currentItem);
                        if (totalValue >= 250) {
                            legendaryKey = currentItem;
                            break;
                        }
                    } else {
                        int momentValue = legendaryMap.get(currentItem);
                        legendaryMap.put(currentItem, momentValue + currentValue);
                        totalValue = legendaryMap.get(currentItem);
                        if (totalValue >= 250) {
                            legendaryKey = currentItem;
                            break;
                        }
                    }
                } else {
                    if (!legendaryMap.containsKey(currentItem)) {
                        legendaryMap.put(currentItem, currentValue);
                    } else {
                        int currValue = legendaryMap.get(currentItem);
                        legendaryMap.put(currentItem, currValue + currentValue);

                    }
                }
            }
            if (totalValue >= 250) {
                continue;
            }
            inputList = Arrays.stream(scan.nextLine().toLowerCase().split(" ")).collect(Collectors.toList());
        }

        String legendaryItem = "";
        switch (legendaryKey) {
            case "motes":
                legendaryItem = "Dragonwrath";
                legendaryMap.put("motes", legendaryMap.get("motes") - 250);
                break;
            case "fragments":
                legendaryItem = "Valanyr";
                legendaryMap.put("fragments", legendaryMap.get("fragments") - 250);
                break;
            case "shards":
                legendaryItem = "Shadowmourne";
                legendaryMap.put("shards", legendaryMap.get("shards") - 250);
                break;
        }
        System.out.println(legendaryItem + " obtained!");

        for (Map.Entry<String, Integer> entry : legendaryMap.entrySet()) {
            if (entry.getKey().equals("shards")) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        } if (!legendaryMap.containsKey("shards")){
            System.out.println("shards: 0");
        }
        for (Map.Entry<String, Integer> entry : legendaryMap.entrySet()) {
            if (entry.getKey().equals("fragments")) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }if (!legendaryMap.containsKey("fragments")){
            System.out.println("fragments: 0");
        }
        for (Map.Entry<String, Integer> entry : legendaryMap.entrySet()) {
            if (entry.getKey().equals("motes")) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }if (!legendaryMap.containsKey("motes")){
            System.out.println("motes: 0");
        }
        for (Map.Entry<String, Integer> entry : legendaryMap.entrySet()) {
            if (!entry.getKey().equals("fragments") && !entry.getKey().equals("motes") && !entry.getKey().equals("shards")) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}



