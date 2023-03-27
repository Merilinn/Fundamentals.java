package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0.0;
        while (!input.equals("end of shift")){
            Pattern pattern = Pattern.compile
                    ("%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>\\d+\\.?[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double total = count * price;
                sum = sum + total;
                System.out.printf("%s: %s - %.2f%n", name, product, total);


            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", sum);;
    }
}
