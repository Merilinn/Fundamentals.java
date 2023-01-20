package DataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char input = scan.nextLine().charAt(0);
            sum += input;

        }
        System.out.println("The sum equals: " + sum);
    }
}
