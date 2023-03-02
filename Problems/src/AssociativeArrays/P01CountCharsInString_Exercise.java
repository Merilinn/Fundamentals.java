package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == ' ') {
                continue;
            }
            Integer value = charMap.get(currentChar);
            if (charMap.containsKey(currentChar)) {
                charMap.put(currentChar, value + 1);
            } else {
                charMap.put(currentChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
