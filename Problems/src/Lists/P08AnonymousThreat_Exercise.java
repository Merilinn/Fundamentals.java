package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        String[] commandList = scan.nextLine().split(" ");
        String currentCommand = commandList[0];

        while (!currentCommand.contains("3:1")) {
            if (currentCommand.equals("merge")) {
                int startIndex = Integer.parseInt(commandList[1]);
                int endIndex = Integer.parseInt(commandList[2]);
                if (startIndex < 0 || endIndex < startIndex) {
                    startIndex = 0;
                }
                if (endIndex > inputList.size()) {
                    endIndex = inputList.size();
                }
                for (int i = startIndex; i < endIndex; i++) {
                    if (inputList.size() == 1 || startIndex == inputList.size()-1 ) {
                        break;

                    }
                    String currentElement = inputList.get(startIndex);
                    String nextElement = inputList.get(startIndex + 1);
                    inputList.set(startIndex, currentElement + nextElement);
                    inputList.remove(startIndex + 1);

                }

            }
            if (currentCommand.equals("divide")) {

                int index = Integer.parseInt(commandList[1]);
                int parts = Integer.parseInt(commandList[2]);

                String elementToDivide = inputList.get(index);
                String elementToRemove = inputList.get(index);
                int elements = elementToDivide.trim().length() / parts;
                int count = 0;
                while (elementToDivide.length() > 0) {
                    String currentElement = "";
                    if (parts == 1){
                        currentElement = elementToDivide;
                        elementToDivide = elementToDivide.replace(currentElement, "");
                        inputList.add(index + count, currentElement);
                        break;
                    }
                    for (int i = 0; i < elements; i++) {
                        char element = elementToDivide.charAt(i);
                        currentElement = currentElement + element;


                    }
                    elementToDivide = elementToDivide.replace(currentElement, "");
                    inputList.add(index + count, currentElement);
                    count++;
                    parts--;
                }
                inputList.remove(elementToRemove);
            }
            commandList = scan.nextLine().split(" ");
            currentCommand = commandList[0];
        }

        System.out.println(String.join(" ", inputList));
    }
}
