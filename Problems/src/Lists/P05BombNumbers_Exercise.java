
package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> inputList = Arrays.stream(scan.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = inputList.get(0);
        int power = inputList.get(1);
        if (power == 0) {
            numbersList.remove(Integer.valueOf(bombNumber));
        }
        int count = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber = 0;
            if (count != 0) {
                currentNumber = numbersList.get(i - 1);
            } else {
                currentNumber = numbersList.get(i);
            }

            if (currentNumber == bombNumber) {
                int currentIndex = 0;
                if (count != 0) {
                    currentIndex = i - 1;
                } else {
                    currentIndex = i;
                }
                int start = currentIndex - power;
                int finish = currentIndex + power;
                i = 0;
                count++;
                if (start < 0) {
                    start = 0;
                }
                if (finish >= numbersList.size()) {
                    finish = numbersList.size() - 1;
                }
                for (int j = start; j <= finish; ++j) {
                    numbersList.remove(start);
                }
            }

        }
        int sumOfListNumbers = 0;
        for (Integer number : numbersList) {
            sumOfListNumbers += number;
            if (number == bombNumber){
                sumOfListNumbers -= number;
            }
        }
        System.out.println(sumOfListNumbers);
    }

}

