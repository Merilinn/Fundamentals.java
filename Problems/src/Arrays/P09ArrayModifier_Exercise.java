package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scan.nextLine().split(" ");

        String currentCommand = command[0];
        while (!currentCommand.equals("end")) {

            if (currentCommand.equals("swap")) {
                String firstIndex = command[1];
                String secondIndex = command[2];
                int indexOne = Integer.parseInt(firstIndex);
                int number = numArray[indexOne];
                int indexTwo = Integer.parseInt(secondIndex);
                numArray[indexOne] = numArray[indexTwo];
                numArray[indexTwo] = number;
                command = scan.nextLine().split(" ");
                currentCommand = command[0];
                continue;
            } else if (currentCommand.equals("multiply")) {
                String firstIndex = command[1];
                String secondIndex = command[2];
                int indexOne = Integer.parseInt(firstIndex);
                int indexTwo = Integer.parseInt(secondIndex);
                numArray[indexOne] = numArray[indexOne] * numArray[indexTwo];
                command = scan.nextLine().split(" ");
                currentCommand = command[0];
                continue;
            } else if (currentCommand.equals("decrease")) {
                for (int j = 0; j < numArray.length; j++) {
                    numArray[j] = numArray[j] - 1;

                }
                command = scan.nextLine().split(" ");
                currentCommand = command[0];
                continue;
            }
            command = scan.nextLine().split(" ");
            currentCommand = command[0];
        }

        for (int i = 0; i < numArray.length; i++) {
            if (i + 1 == numArray.length) {
                System.out.print(numArray[i]);
                break;
            }
            System.out.print(numArray[i] + ", ");
        }
    }
}






