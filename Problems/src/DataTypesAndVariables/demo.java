package DataTypesAndVariables;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            System.out.println(a);
        }
    }
}
