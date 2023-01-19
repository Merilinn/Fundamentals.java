package BasicSyntax;

import java.util.Scanner;

public class P7TheatrePromotion_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;
        switch (typeDay) {
            case "Weekday":
                if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                } else {
                    System.out.println("Error!");
                }
                break;
        }
        if (age >= 0 && age <= 122) {
            System.out.printf("%d$", price);
        }
    }
}

