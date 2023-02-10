package Methods;

import java.util.Scanner;

public class P10MultiplyEvensByOdds_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        System.out.println(Math.abs(sumEven(input) * sumOdd(input)));


    }

    public static int sumEven(int number) {
        int sumEven = 0;
        while (number != 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            }
            number = number / 10;
        }
        return sumEven;

    }

    public static int sumOdd(int number) {
        int sumOdd = 0;
        while (number != 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 != 0) {
                sumOdd += currentNumber;
            }
            number = number / 10;


        }
        return sumOdd;
    }
}
