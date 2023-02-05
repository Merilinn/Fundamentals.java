package Methods;

import java.util.Scanner;

public class P03CharactersInRange_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        range(first, second);

    } public static void range (char a, char b){
            int max = Math.max(a, b);
            int min = Math.min(a, b);
        for (int i = min + 1; i < max; i++) {

            System.out.print((char) i + " ");

        }
    }
}
