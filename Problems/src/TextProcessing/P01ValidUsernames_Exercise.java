package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01ValidUsernames_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] inputArr = scan.nextLine().split(", ");

    List<String> correctUsernames = new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {
            String currentUsername = inputArr[i];
            if (currentUsername.length() >= 3 && currentUsername.length() <= 16){
                for (int j = 0; j < currentUsername.length(); j++) {
                    char symbol = currentUsername.charAt(j);
                    if (!Character.isLetter(symbol) && !Character.isDigit(symbol) && symbol != 45 && symbol != 95){
                     break;
                    }
                    if (j + 1 == currentUsername.length()){

                        correctUsernames.add(currentUsername);
                    }
                }
            }
        }
        System.out.println(String.join(System.lineSeparator(), correctUsernames));
    }
}
