package Arrays;

import java.util.Scanner;

public class P03SumEvenNumbers_Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] addArr = input.split(" ");
        int[] numbersArr = new int[addArr.length];


        int sumEven = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(addArr[i]);
            int currentNumber = numbersArr[i];
            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            }

        }
        System.out.println(sumEven);


    }
}

