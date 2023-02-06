package Methods;

import java.util.Scanner;

public class P09PalindromeIntegers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("END")) {

            System.out.println(palindromeOrNot(input));
            input = scan.nextLine();

        }
    }

    public static boolean palindromeOrNot(String input) {

        String newNum = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char firstSymbol = input.charAt(i);
            newNum = newNum + firstSymbol;

        }
        if (newNum.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}

