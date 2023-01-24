package DataTypesAndVariables;

import java.util.Scanner;

public class P06BalancedBrackets_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int brackets = 0;

        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();
            char symbol = text.charAt(0);
            if (symbol == 40) {
                brackets += 1;
                if (brackets >= 2) {
                    break;
                }
            } else if (symbol == 41) {
                brackets -= 1;
                if (brackets <= -1) {
                    break;
                }
            }
        }
        if (brackets == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
