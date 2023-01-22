package DataTypesAndVariables;

import java.util.Scanner;

public class P04RefactoringPrimeChecker_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= n; i++) {
            boolean primeOrNot = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeOrNot = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, primeOrNot);
        }

    }
}
