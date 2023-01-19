package BasicSyntax;

import java.util.Scanner;

public class P11MultiplicationTable2_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());


        for (int i = n; i <= 10 ; i++) {
            int sum = input * i;

            System.out.printf("%d X %d = %d%n", input, i, sum);

        } if (n > 10){
            int sum1 = input * n;
            System.out.printf("%d X %d = %d%n", input, n, sum1);
        }
    }
}
