package TextProcessing;

import java.util.Scanner;

public class P02RepeatStrings_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] wordArr = scan.nextLine().split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            String currentWord = wordArr[i];
            int times = currentWord.length();
            for (int j = 0; j < times; j++) {
                System.out.print(currentWord);

            }

        }

    }
}
