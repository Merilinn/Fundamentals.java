package DataTypesAndVariables;

import java.util.Scanner;

public class P01DataTypeFinder_MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String type = "";


        while (!input.equals("END")) {

            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";

            } else if (input.length() == 1) {
                char symboll = input.charAt(0);
                if (symboll <= 47 || symboll >= 58) {
                    type = "character";
                } else {
                    type = "integer";
                }
            } else if (input.length() >= 2) {

                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);

                    if (symbol == 46 || symbol == 44) {
                        type = "floating point";
                        break;
                    } else if (symbol >= 58 || symbol <= 47) {
                        type = "string";
                        break;
                    } else {
                        type = "integer";
                    }
                }
                char sym = input.charAt(0);
                if (sym == 45) {
                    for (int j = 1; j < input.length(); j++) {
                        sym = input.charAt(j);

                        if (sym == 46 || sym == 44) {
                            type = "floating point";
                            break;
                        } else if (sym >= 58 || sym <= 47) {
                            type = "string";
                            break;
                        } else {
                            type = "integer";
                        }
                    }
                }
            }
            System.out.printf("%s is %s type%n", input, type);
            input = scan.nextLine();
        }
    }
}



