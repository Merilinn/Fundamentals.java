package TextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputText = scan.nextLine().split(" ");

        System.out.println(resultMethod(inputText[0], inputText[1]));
    }

    public static String resultMethod(String first, String second) {
        int totalSum = 0;
        int maxLength = 0;

        if (first.length() > second.length()) {
            maxLength = first.length();
        } else if (first.length() == second.length()) {
            maxLength = first.length();
        } else {
            maxLength = second.length();
        }
        char firstSymbol = 0;
        char secondSymbol = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < first.length()) {
                firstSymbol = first.charAt(i);
            }
            if (i < second.length()) {
                secondSymbol = second.charAt(i);
            }
            if (i < first.length() && i < second.length()) {
                int multiply = firstSymbol * secondSymbol;
                totalSum += multiply;
            } else if (i >= first.length()) {
                totalSum += secondSymbol;

            } else {
                totalSum += firstSymbol;

            }
        }
            return String.valueOf(totalSum);
    }
}
