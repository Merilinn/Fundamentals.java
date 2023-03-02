package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numbersMap = new TreeMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            double currentKey = numbersList.get(i);
            Integer value = numbersMap.get(currentKey);
            if (!numbersMap.containsKey(currentKey)) {
                numbersMap.put(currentKey, 1);
            } else {
            numbersMap.put(currentKey, value + 1);}
        }
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}

