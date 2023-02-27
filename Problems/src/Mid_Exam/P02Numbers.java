package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");
        String currentCommand = command[0];

        while (!currentCommand.equals("Finish")) {

            if (currentCommand.equals("Add")) {
                int numberToAdd = Integer.parseInt(command[1]);
                numberList.add(numberList.size(), numberToAdd);
            } else if (currentCommand.equals("Remove")) {
                int numberToRemove = Integer.parseInt(command[1]);
                if (numberList.contains(numberToRemove)) {
                    for (int i = 0; i < numberList.size(); i++) {
                        int currentNumber = numberList.get(i);
                        if (currentNumber == numberToRemove) {
                            numberList.remove(Integer.valueOf(currentNumber));
                            break;
                        }
                    }
                }
            } else if (currentCommand.equals("Replace")) {
                int numberToReplace = Integer.parseInt(command[1]);
                int replacement = Integer.parseInt(command[2]);
                for (int i = 0; i < numberList.size(); i++) {
                    int currentNumber = numberList.get(i);
                    if (currentNumber == numberToReplace){
                        numberList.set(i, replacement);
                        break;
                    }
                }
            } else if (currentCommand.equals("Collapse")) {
                int number = Integer.parseInt(command[1]);
                for (int i = 0; i < numberList.size(); i++) {
                    int currentNumber = numberList.get(i);
                    if (currentNumber < number){
                        numberList.remove(Integer.valueOf(currentNumber));
                        i = -1;
                    }
                }
            }
            command = scan.nextLine().split(" ");
            currentCommand = command[0];
        }
        for (Integer number : numberList) {
            System.out.print(number + " ");

        }
    }
}
