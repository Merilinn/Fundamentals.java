package BasicSyntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P5Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String pass = "";
        int inputTime = 1;

        for (int i = username.length()-1; i >= 0; i--) {
            pass = pass + username.charAt(i);
        }
        String input = scan.nextLine();
        while (!input.equals(pass)){
            System.out.println("Incorrect password. Try again.");
            input = scan.nextLine();
            inputTime++;
            if (inputTime >= 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
        }
    if (input.equals(pass)){
        System.out.printf("User %s logged in.", username);

    }    }
}
