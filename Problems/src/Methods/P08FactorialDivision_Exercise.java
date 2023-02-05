package Methods;

import java.util.Scanner;

public class P08FactorialDivision_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        long firstFactorial = factorialSum(first);
        long secondFactorial = factorialSum(second);

        System.out.printf("%.2f", (divideFact(firstFactorial, secondFactorial)));

    }

    public static long factorialSum(int n) {
        long sum;
        if (n < 0) {
            sum = -1;
            for (int i = n; i <= -1; i++) {
                sum = sum * i;

            }
        } else {
            sum = 1;
            for (int i = n; i >= 1; i--) {
                sum = sum * i;
            }
        }
        return sum;
    }

    public static double divideFact(double a, double b) {

        return a / b;
    }
}
