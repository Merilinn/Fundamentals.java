package TextProcessing;

import java.util.Scanner;

public class P06ReplaceRepeatingChars_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        StringBuilder resultText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (i == 0) {
                resultText.append(currentChar);
            }
            if (resultText.charAt(resultText.length() - 1) != currentChar) {
                resultText.append(currentChar);
            }
        }
        System.out.println(resultText);
    }
}
