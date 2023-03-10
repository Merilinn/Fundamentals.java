package DataTypesAndVariables;

import java.util.Scanner;

public class P10SpecialNumbers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sum = sum + lastDigit;
                currentNum = currentNum / 10;

            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }}
