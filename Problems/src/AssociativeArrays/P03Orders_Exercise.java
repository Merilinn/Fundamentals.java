package AssociativeArrays;

import java.util.*;

public class P03Orders_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, List<Double>> productMap = new LinkedHashMap<>();
        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);
            if (productMap.containsKey(product)) {
                productMap.get(product).set(0, price);
                double currentQuantity = productMap.get(product).get(1);
                productMap.get(product).set(1, quantity + currentQuantity);
            }else {
            productMap.putIfAbsent(product, new ArrayList<>());
            productMap.get(product).add(price);
            productMap.get(product).add(quantity);}
            input = scan.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
           double priceList = entry.getValue().get(0);
           double quantityList = entry.getValue().get(1);
           double result = priceList * quantityList;
           entry.getValue().remove(0);
           entry.getValue().remove(0);
           entry.getValue().add(result);
        }
        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0));
        }


    }
    }

