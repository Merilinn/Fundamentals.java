package TextProcessing;

import java.util.Scanner;

public class P07StringExplosion_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());
        long count = input.chars().filter(ch -> ch == '>').count();
        StringBuilder resultSB = new StringBuilder();
        int surplus = 0;

        while (count > 0) {
            int index = input.indexOf(">");
            char power = input.charAt(index + 1);
            int bombPower = Character.getNumericValue(power) + surplus;
            for (int i = 0; i <= index; i++) {
                resultSB.append(input.charAt(0));
                input.deleteCharAt(0);
            }
            for (int j = 0; j < bombPower; j++) {
                if (bombPower == 1) {
                    input.deleteCharAt(0);
                }

                 else {
                    if (input.charAt(0) == '>') {
                        surplus = bombPower - j;
                        break;
                    } else {
                        input.deleteCharAt(0);
                        if (input.length() == 0){
                            break;

                        }                    }
                }
            }
            count--;
            if (count == 0 && input.length() > 0) {
                for (int i = 0; i < input.length(); i++) {
                    resultSB.append(input.charAt(i));

                }
            }
        }
        System.out.println(resultSB);
    }
}

