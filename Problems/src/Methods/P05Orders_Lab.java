package Methods;

import java.util.Scanner;

public class P05Orders_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        switch (product) {
            case "coffee":
                priceCoffee(count, product);
                break;
            case "water":
                priceWater(count, product);
                break;
            case "coke":
                priceCoke(count, product);
                break;
            case "snacks":
                priceSnacks(count, product);
                break;
        }
    }

    public static void priceCoffee(int count, String product) {

        System.out.printf("%.2f", count * 1.50);
    }

    public static void priceWater(int count, String product) {

        System.out.printf("%.2f", count * 1.00);
    }

    public static void priceCoke(int count, String product) {

        System.out.printf("%.2f", count * 1.40);
    }

    public static void priceSnacks(int count, String product) {

        System.out.printf("%.2f", count * 2.00);
    }
}
