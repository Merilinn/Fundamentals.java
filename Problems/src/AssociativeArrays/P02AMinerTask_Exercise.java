package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resource = scan.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int value = Integer.parseInt(scan.nextLine());
            if (resourceMap.containsKey(resource)) {
                resourceMap.put(resource, resourceMap.get(resource) + value);
            }

            resourceMap.putIfAbsent(resource, value);
            resource = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
