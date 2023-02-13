package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> wagonList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scan.nextLine());
        String[] command = scan.nextLine().split(" ");
        String currentCommand = command[0];
        while (!currentCommand.equals("end")) {
            if (currentCommand.equals("Add")) {
                int passengersToAdd = Integer.parseInt(command[1]);
                wagonList.add(passengersToAdd);
            } else {
                int passengersAddToWagon = Integer.parseInt(command[0]);
                for (int i = 0; i < wagonList.size(); i++) {
                    int currentWagon = wagonList.get(i);
                    if (currentWagon + passengersAddToWagon <= maxPassengers) {
                        wagonList.set(i, currentWagon + passengersAddToWagon);
                        break;
                    }

                }
            }

            command = scan.nextLine().split(" ");
            currentCommand = command[0];
        }
        for (Integer passengers : wagonList) {
            System.out.print(passengers + " ");

        }
    }
}
