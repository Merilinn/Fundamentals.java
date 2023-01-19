package BasicSyntax;

import java.util.Scanner;

public class P9SumOfOddNumbers_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Sum: " + sum);
    }
}
