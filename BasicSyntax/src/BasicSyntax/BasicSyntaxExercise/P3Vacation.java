package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int group = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;
        if (day.equals("Friday")) {
            switch (type) {
                case "Students":
                    price = group * 8.45;
                    break;
                case "Business":
                    price = group * 10.90;
                    break;
                case "Regular":
                    price = group * 15;
                    break;
            }
        }
        if (day.equals("Saturday")) {
            switch (type) {
                case "Students":
                    price = group * 9.80;
                    break;
                case "Business":
                    price = group * 15.60;
                    break;
                case "Regular":
                    price = group * 20;
                    break;
            }
        }
        if (day.equals("Sunday")) {
            switch (type) {
                case "Students":
                    price = group * 10.46;
                    break;
                case "Business":
                    price = group * 16;
                    break;
                case "Regular":
                    price = group * 22.50;
                    break;
            }
        }
        if (type.equals("Students") && group >= 30){
            price = price - price * 0.15;
        } else if (type.equals("Business") && group >= 100) {
            price = price / group;
            int totalGroup = group - 10;
            price = price * totalGroup;
        } else if (type.equals("Regular") && group >= 10 && group <=20){
            price = price - price * 0.05;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
