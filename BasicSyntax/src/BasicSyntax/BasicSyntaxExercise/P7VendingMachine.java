package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P7VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double insert = 0.0;
        String input = scan.nextLine();
        double totalMoney = 0.0;
        String product = "";
        double price = 0.0;

        while (!input.equals("Start")) {
            insert = Double.parseDouble(input);
            if (insert == 0.1) {
                totalMoney += 0.1;
            } else if (insert == 0.2) {
                totalMoney += 0.2;
            } else if (insert == 0.5) {
                totalMoney += 0.5;
            } else if (insert == 1) {
                totalMoney += 1;
            } else if (insert == 2) {
                totalMoney += 2;
            } else {
                System.out.printf("Cannot accept %.2f", insert);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                product = "Nuts";
                price = 2.0;
                if (totalMoney >= price) {
                    System.out.println("Purchased " + product);
                    totalMoney -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Water")) {
                product = "Water";
                price = 0.7;
                if (totalMoney >= price) {
                    System.out.println("Purchased " + product);
                    totalMoney -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Crisps")) {
                product = "Crisps";
                price = 1.50;
                if (totalMoney >= price) {
                    System.out.println("Purchased " + product);
                    totalMoney -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Soda")) {
                product = "Soda";
                price = 0.80;
                if (totalMoney >= price) {
                    System.out.println("Purchased " + product);
                    totalMoney -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Coke")) {
                product = "Coke";
                price = 1.0;
                if (totalMoney >= price) {
                    System.out.println("Purchased " + product);
                    totalMoney -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }

            } else {
                System.out.println("Invalid product");
            }

            input = scan.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }

}

