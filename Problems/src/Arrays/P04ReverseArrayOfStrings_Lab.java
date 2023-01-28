package Arrays;

import java.util.Scanner;

public class P04ReverseArrayOfStrings_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] input = scan.nextLine().split(" ");

        for (int i = 0; i < input.length/2; i++) {
            String current = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = current;

        }
        System.out.print(String.join(" ", input));
    }
}
