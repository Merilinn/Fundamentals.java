package Methods;

import java.util.Scanner;

public class P04Calculations_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String calculation = scan.nextLine();
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        if (calculation.equals("add")){
            add(first, second);
        } else if (calculation.equals("multiply")) {
            multiply(first, second);
        } else if (calculation.equals("subtract")) {
            substract(first, second);
        } else if (calculation.equals("divide")) {
            divide(first, second);
        }
    }

    public static void add (int first, int second) {
        System.out.println(first + second);
    } public static void multiply (int first, int second){
        System.out.println(first * second);
    }public static void substract (int first, int second){
        System.out.println(first - second);
    }public static void divide (int first, int second){
        System.out.println(first / second);
    }
}
