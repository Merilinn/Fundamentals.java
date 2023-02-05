package Methods;

import java.util.Scanner;

public class P04PasswordValidator_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        int count = 0;
        while (count < 3) {


            if (!length(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            count++;
            if (!content(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            count++;
            if (!digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
            count++;
        }

        if (length(password) && content(password) && digits(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean length(String input) {
        if (input.length() < 6 || input.length() > 10) {
            return false;

        } else {
            return true;
        }
    }

    public static boolean content(String input) {

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol >= 48 && currentSymbol <= 57 || currentSymbol >= 65 && currentSymbol <= 90 ||
                    currentSymbol >= 97 && currentSymbol <= 122) {
                if (i + 1 == input.length()) {
                    return true;
                }
            }else {
                return false;
            }
        }return content(input);
    }

    public static boolean digits(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol >= 48 && currentSymbol <= 57) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        } else {
            return true;

        }
    }
}
