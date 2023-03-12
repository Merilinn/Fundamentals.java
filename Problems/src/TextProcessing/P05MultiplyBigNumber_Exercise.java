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

        for (int i = 0; i < result.length(); i++) {
            char currentDigit = result.charAt(i);
            if (currentDigit == '0') {
                System.out.println("0");
                break;
            } else {
                System.out.println(result);
                break;
            }
        }
    }
}

