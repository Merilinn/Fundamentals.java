package DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = 0;
        char second = 0;
        char third = 0;

        for (int i = 0; i < 3; i++) {
            char input = scan.nextLine().charAt(0);
            if (i == 0){
                first = input;
            } else if (i == 1) {
                second = input;
            } else {
                third = input;
            }
        }
        System.out.printf("%c %c %c", third, second, first);
    }
}
