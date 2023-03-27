package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] demon = scan.nextLine().split(",");
        int count = demon.length;
        int demonIndex = 0;
        while (count > 0) {
            int health = 0;
            String currentDemon = demon[demonIndex];
            currentDemon = currentDemon.replaceAll(" ", "");
            for (int i = 0; i < currentDemon.length(); i++) {
                char currentSymbol = currentDemon.charAt(i);

                if (!Character.isDigit(currentSymbol) && currentSymbol != '.' &&
                        currentSymbol != '+' && currentSymbol != '-' && currentSymbol != '*' && currentSymbol != '/') {
                    health += currentSymbol;
                }
            }
            double damage = 0.0;
            String regex = "[+-]?\\d+\\.?\\d*";
            Pattern pattern = Pattern.compile("[+-]?\\d+\\.?\\d*");
            Matcher matcher = pattern.matcher(currentDemon);
            while (matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }
            for (int i = 0; i < currentDemon.length(); i++) {
                char currentSymbol = currentDemon.charAt(i);

                if (currentSymbol == '*') {
                    damage = damage * 2;
                }
                if (currentSymbol == '/') {
                    damage = damage / 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", currentDemon, health, damage);

            demonIndex++;
            count--;
        }
    }
}
