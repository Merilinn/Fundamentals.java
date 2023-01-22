package DataTypesAndVariables;

import java.util.Scanner;

public class P05DecryptingMessage_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            char symbol = scan.nextLine().charAt(0);
            System.out.printf("%c", symbol + key);

        }
    }
}
