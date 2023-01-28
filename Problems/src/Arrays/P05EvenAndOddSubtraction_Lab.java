package Arrays;

import java.util.Scanner;

public class P05EvenAndOddSubtraction_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] numbersArr = (scan.nextLine().split( " "));
        int [] numArr = new int[numbersArr.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            numArr [i] = Integer.parseInt(numbersArr[i]);
            if (numArr[i] % 2 == 0){
                sumEven += numArr[i];
            } else {
                sumOdd += numArr[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
