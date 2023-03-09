package TextProcessing;

import java.util.Scanner;

public class P01ReverseStrings_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        while (!word.equals("end")){
            StringBuilder reversedWord = new StringBuilder();
            reversedWord.append(word);
            System.out.println(word + " = " + reversedWord.reverse());

            word = scan.nextLine();
        }
    }
}
