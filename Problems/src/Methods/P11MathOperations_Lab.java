package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstN = Double.parseDouble(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        double secondN = Double.parseDouble(scan.nextLine());

        switch (operator){
            case '*':
                System.out.println(new DecimalFormat("0.##").format(multiply(firstN, secondN)));
                break;
            case '+':
                System.out.println(new DecimalFormat("0.##").format(add(firstN, secondN)));
                break;
            case  '/':
                System.out.println(new DecimalFormat("0.##").format(divide(firstN, secondN)));
                break;
            case '-':
                System.out.println(new DecimalFormat("0.##").format(subtract(firstN, secondN)));
                break;
        }
    }public static double multiply (double a, double b) {
        return a * b;
    } public static double add (double a, double b){
        return a + b;
    }public static double divide (double a, double b){
        return a / b;
    }public static double subtract (double a, double b){
        return a - b;
    }
}
