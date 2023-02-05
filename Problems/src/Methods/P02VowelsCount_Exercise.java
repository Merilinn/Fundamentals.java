package Methods;

import java.util.Scanner;

public class P02VowelsCount_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        vowels(input);

    }

    public static void vowels(String text) {
        int countVowel = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == 65 || symbol == 69 || symbol == 73 || symbol == 79 || symbol == 85) {
                countVowel++;
            } else if (symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117) {
                countVowel++;

            }

        }
        System.out.println(countVowel);

    }

}
