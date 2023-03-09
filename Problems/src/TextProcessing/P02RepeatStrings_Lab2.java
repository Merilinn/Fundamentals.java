package TextProcessing;

import java.util.Scanner;

public class P02RepeatStrings_Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] wordArr = scan.nextLine().split(" ");

        StringBuilder resultSb = new StringBuilder();

        for (String word : wordArr) {
            int timesToRepeat = word.length();
            for (int i = 0; i < timesToRepeat; i++) {
                resultSb.append(word);
            }
        }
        System.out.println(resultSb);
    }
}
