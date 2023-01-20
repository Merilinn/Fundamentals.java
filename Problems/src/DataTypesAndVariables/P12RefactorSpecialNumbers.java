package DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }


            if (sum == 5 || sum == 7 || sum == 11) {
                flag = true;
                System.out.printf("%d -> True%n", currentNum);
            } else {
                flag = false;
                System.out.printf("%d -> False%n", currentNum);

            }
            sum = 0;
            i = currentNum;
        }
    }

}
