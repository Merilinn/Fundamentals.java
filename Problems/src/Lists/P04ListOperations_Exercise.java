package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandList = Arrays.asList(scan.nextLine().split(" "));
        String currentCommand = commandList.get(0);

        while (!currentCommand.equals("End")) {
            int numberToAdd = Integer.MIN_VALUE;
            int index = Integer.MIN_VALUE;
            if (currentCommand.startsWith("Add")) {
                numberToAdd = Integer.parseInt(commandList.get(1));
                numbersList.add(numberToAdd);
            } else if (currentCommand.startsWith("Insert")) {
                numberToAdd = Integer.parseInt(commandList.get(1));
                index = Integer.parseInt(commandList.get(2));
                if (index > numbersList.size() || index < 0) {
                    System.out.println("Invalid index");

                } else {
                    numbersList.add(index, numberToAdd);
                }
            } else if (currentCommand.startsWith("Remove")) {
                index = Integer.parseInt(commandList.get(1));
                if (index > numbersList.size() || index < 0) {
                    System.out.println("Invalid index");

                }
                else {
                    numbersList.remove(index);
                }
            }
            else if (commandList.contains("left")) {
                int count = Integer.parseInt(commandList.get(2));

                for (int i = 0; i < count; i++) {
                    int currentNumber = numbersList.get(0);
                    numbersList.add(currentNumber);
                    numbersList.remove(numbersList.get(0));
                }
            }
            else if (commandList.contains("right")) {
                int count = Integer.parseInt(commandList.get(2));

                for (int i = 0; i < count; i++) {
                    int currentNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.add(0, currentNumber);
                    numbersList.remove(numbersList.size() - 1);
                }
            }
            commandList = Arrays.asList(scan.nextLine().split(" "));
            currentCommand = commandList.get(0);
        }
        for (Integer number : numbersList) {
            System.out.print (number + " ");

        }
    }
}
