package Arrays;

import java.util.Scanner;

public class P02CommonElements_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] firstArr = scan.nextLine().split(" ");
        String [] secondArr = scan.nextLine().split(" ");

        for (String input : secondArr) {
            for (String inputSecond : firstArr) {
                if (input.equals(inputSecond)){
                    System.out.print(input + " ");
                }

            }

        }
    }
}
