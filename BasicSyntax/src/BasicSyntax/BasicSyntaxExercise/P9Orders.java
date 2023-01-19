package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P9Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int orders = Integer.parseInt(scan.nextLine());
        double priceOrder = 0.0;
        double total = 0.0;

        while (orders > 0) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());
            priceOrder = (days * capsuleCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOrder);
            total += priceOrder;
            priceOrder = 0.0;

            orders--;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
