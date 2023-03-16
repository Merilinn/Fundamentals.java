package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
