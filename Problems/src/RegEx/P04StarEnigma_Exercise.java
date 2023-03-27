package RegEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder resultSB = new StringBuilder();
        String regex = "[^@\\-!:>]*@(?<planetName>[A-Z][a-z]*)[^@\\-!:>]*:*(?<polulation>\\d*)![^@\\-!:>]*" +
                "(?<type>[A-Z])![^@\\-!:>]*->(?<soldier>\\d*)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedList = new ArrayList<>();
        List<String> destroyedList = new ArrayList<>();
        int attacked = 0;
        int destroyed = 0;
        while (n > 0){
            String input = scan.nextLine();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                if (currentSymbol == 's' || currentSymbol == 'S' || currentSymbol == 't' || currentSymbol == 'T'
                        || currentSymbol == 'a' || currentSymbol == 'A' || currentSymbol == 'r' || currentSymbol == 'R'){
                    count ++;
                }
            }
            for (int i = 0; i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                resultSB.append((char) (currentSymbol - count));
            }
            Matcher matcher = pattern.matcher(resultSB);
            if (matcher.find()){
                if (matcher.group("type").equals("A")){
                    attacked++;
                    attackedList.add(resultSB.toString());
                } else if (matcher.group("type").equals("D")) {
                    destroyed++;
                    destroyedList.add(resultSB.toString());
                }else {
                    break;
                }
            }
            resultSB.delete(0, resultSB.length());
            n--;
        }
        Collections.sort(attackedList);
        System.out.println("Attacked planets: " + attacked);
        for (String planet : attackedList) {
            Matcher matcher = pattern.matcher(planet);
            if (matcher.find()){
                System.out.println("-> " + matcher.group("planetName"));
            }
        }
        Collections.sort(destroyedList);
        System.out.println("Destroyed planets: " + destroyed);
        for (String planet : destroyedList) {
            Matcher matcher = pattern.matcher(planet);
            if (matcher.find()){
                System.out.println("-> " + matcher.group("planetName"));

            }
        }
    }
}
