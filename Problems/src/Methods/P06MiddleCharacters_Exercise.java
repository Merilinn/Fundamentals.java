package Methods;

import java.util.Scanner;

public class P06MiddleCharacters_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();
        middleChar(inputText);
    }

    public static void middleChar(String input) {

        if (input.length() % 2 != 0) {
            int mid = input.length() / 2;
            char middle = input.charAt(mid);
            System.out.println(middle);
        } else {
            int mid = input.length() / 2;
            char middleRight = input.charAt(mid);
            char middleLeft = input.charAt(mid - 1);
            System.out.printf("%s%s", middleLeft, middleRight);

        }
    }
}
