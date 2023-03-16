package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08LettersChangeNumbers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toUnmodifiableList());
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] alphabetArr = alphabet.split(" ");
        List<Double> resultList = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            int firstPosition = 0;
            int secondPosition = 0;
            String currentText = inputList.get(i);
            char firstLetter = currentText.charAt(0);
            char lastLetter = currentText.charAt(currentText.length() - 1);
            int number = Integer.parseInt(currentText.substring(1, currentText.length() - 1));

            for (int k = 0; k < alphabetArr.length; k++) {
                char currentLetter = alphabetArr[k].charAt(0);
                if (currentLetter == Character.toLowerCase(firstLetter)) {
                    firstPosition = k + 1;
                }
                if (currentLetter == Character.toLowerCase(lastLetter)) {
                    secondPosition = k + 1;
                }
                if (firstPosition != 0 && secondPosition != 0) {
                    break;
                }
            }
            if (Character.isUpperCase(firstLetter)) {
                resultList.add((double) number / firstPosition);
            } else if (Character.isLowerCase(firstLetter)) {
                resultList.add((double) number * firstPosition);
            }
            if (Character.isUpperCase(lastLetter)) {

                double result = resultList.get(i);
                resultList.set(i, result - secondPosition);

            } else if (Character.isLowerCase(lastLetter)) {
                double result = resultList.get(i);
                resultList.set(i, result + secondPosition);
            }
        }
        double total = 0.0;
        for (Double result : resultList) {
            total += result;
        }
        System.out.printf("%.2f", total);
    }
}

