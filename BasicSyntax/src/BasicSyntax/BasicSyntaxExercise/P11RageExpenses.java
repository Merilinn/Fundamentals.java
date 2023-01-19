package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        double neededSum = 0.0;

        for (int count = 1; count <= lostGames; count++) {
            if (count % 2 == 0) {
                neededSum += headsetPrice;
                headset += 1;
            }
            if (count % 3 == 0) {
                neededSum += mousePrice;
                mouse += 1;
            }
            if (count % 6 == 0) {
                neededSum += keyboardPrice;
                keyboard += 1;
            }
            if (keyboard == 2) {
                neededSum += displayPrice;
                keyboard = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", neededSum);

    }
}
