package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0.0;

        while (!input.equals("Purchase")) {
            String regex = ">>\\b(?<name>[A-Za-z]+)<<(?<price>[0-9?.]+)!(?<quantity>\\d+)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                if (sum == 0.0) {
                    System.out.println("Bought furniture:");

                }
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += quantity * price;
                System.out.println(name);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
