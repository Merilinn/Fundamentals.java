package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");
        String action = command[0];
        while (!action.equals("end")) {

            switch (action) {
                case "Add":
                    int number = Integer.parseInt(command[1]);
                    numbersList.add(number);
                    break;
                case "Remove":
                    number = Integer.parseInt(command[1]);
                    numbersList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(command[1]);
                    numbersList.remove(index);
                    break;
                case "Insert":
                    number = Integer.parseInt(command[1]);
                    index = Integer.parseInt(command[2]);
                    numbersList.add(index, number);
                    break;
            }

            command = scan.nextLine().split(" ");
            action = command[0];
        }
        for (Integer item : numbersList) {
            System.out.print(item + " ");

        }
    }
}
