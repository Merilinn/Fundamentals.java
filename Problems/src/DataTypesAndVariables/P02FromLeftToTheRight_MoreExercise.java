package DataTypesAndVariables;

import java.util.Scanner;

public class P02FromLeftToTheRight_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        long lastDigit = 0;
        int sumDigits = 0;

        for (int i = 0; i < n; i++) {
            String leftInput = scan.next();
            long left = Long.parseLong(leftInput);
            String rightInput = scan.next();
            long right = Long.parseLong(rightInput);
            if (left > right) {
                while (left != 0) {
                    lastDigit = left % 10;
                    sumDigits += lastDigit;
                    left = left / 10;
                }
            } else {
                while (right != 0) {
                    lastDigit = right % 10;
                    sumDigits += lastDigit;
                    right = right / 10;
                }
            }
            System.out.println(Math.abs(sumDigits));
            sumDigits = 0;
            scan.nextLine();

        }
    }
}
