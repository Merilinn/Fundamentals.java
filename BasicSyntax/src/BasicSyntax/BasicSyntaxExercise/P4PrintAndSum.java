package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P4PrintAndSum {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int start = Integer.parseInt(scan.nextLine());
       int fin = Integer.parseInt(scan.nextLine());
       int sum = 0;

        for (int i = start; i <= fin ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
