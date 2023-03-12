package TextProcessing;

import java.util.Scanner;

public class P05MultiplyBigNumber_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bigNumber = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        StringBuilder result = new StringBuilder();
        int toAdd = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int lastDigit = Integer.parseInt(bigNumber.split("")[i]);
            int resultMultiply = lastDigit * number;

            int lastDigitOfResult = resultMultiply % 10;

            if (result.length() <= 0) {
                result.append(lastDigitOfResult);
                toAdd = resultMultiply / 10;
            } else {

                if (toAdd + lastDigitOfResult >= 10) {
                    int sum = lastDigitOfResult + toAdd;
                    int lastDigitOfToAdd = sum % 10;
                    result.append(lastDigitOfToAdd);
                    toAdd = (resultMultiply + toAdd) / 10;
                } else {
                    result.append(lastDigitOfResult + toAdd);
                    toAdd = resultMultiply / 10;
                }
            }
        }
        if (toAdd > 0) {
            result.append(toAdd).reverse();
        } else {
            result.reverse();
        }
            int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            int currentDigit = Character.getNumericValue(result.charAt(i));
            sum += currentDigit;
        }
        if (sum == 0) {
            System.out.println("0");

        } else {
            for (int i = 0; i <= result.length()*3; i++) {
                int currentDigit = Character.getNumericValue(result.charAt(0));
                if (currentDigit == 0){
                    result.deleteCharAt(0);
                }else {
                    break;

                }
            }
            System.out.println(result);

        }
    }
}

