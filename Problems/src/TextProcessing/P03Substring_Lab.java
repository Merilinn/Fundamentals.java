package TextProcessing;

import java.util.Scanner;

public class P03Substring_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String toRemove = scan.nextLine();
        String word = scan.nextLine();


        while (word.contains(toRemove)){
            word = word.replace(toRemove, "");

        }
        System.out.println(word);}
}
