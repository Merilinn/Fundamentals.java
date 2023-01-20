package DataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigits_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int currentNum = num;
        int digitsCount = 0;
        int sum = 0;

        while (num > 0){
            num = num / 10;
            digitsCount++;
        }
        for (int i = 0; i < digitsCount; i++) {
            int lastDigit = currentNum % 10;
            sum += lastDigit;
            currentNum = currentNum / 10;
        }
        System.out.println(sum);
    }
}
