package TextProcessing;

import java.util.Scanner;

public class P04CaesarCipher_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder cryptText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            int toAppend = currentSymbol + 3;
            cryptText.append(Character.valueOf((char) toAppend));

        }
        System.out.println(cryptText);
    }
}
