package FinalExam;

import java.util.Scanner;

public class PP01WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destinations = scan.nextLine();
        String[] commandArr = scan.nextLine().split(":");
        String currentCommand = commandArr[0];
        StringBuilder destinationsSb = new StringBuilder(destinations);
        while (!currentCommand.equals("Travel")) {
            if (currentCommand.startsWith("Add")) {
                int index = Integer.parseInt(commandArr[1]);
                String destinationToAdd = commandArr[2];
                if (destinationsSb.length() > index) {
                    destinationsSb.insert(index, destinationToAdd);
                }
                System.out.println(destinationsSb);
            } else if (currentCommand.startsWith("Remove")) {
                int start = Integer.parseInt(commandArr[1]);
                int stop = Integer.parseInt(commandArr[2]);
                if ( start < destinationsSb.length() && stop < destinationsSb.length()) {
                    destinationsSb.delete(start, stop + 1);

                }
                System.out.println(destinationsSb);

            } else if (currentCommand.startsWith("Switch")) {
                String oldString = commandArr[1];
                String newString = commandArr[2];
                int indexToSwitch = destinationsSb.indexOf(oldString);
                int length = oldString.length();
                if (destinationsSb.indexOf(oldString) >= 0) {
                    destinationsSb.replace(indexToSwitch, indexToSwitch + length, newString);


                }
                System.out.println(destinationsSb);
            }
            commandArr = scan.nextLine().split(":");
            currentCommand = commandArr[0];
        }
        System.out.printf("Ready for world tour! Planned stops: %s", destinationsSb);

    }
}

