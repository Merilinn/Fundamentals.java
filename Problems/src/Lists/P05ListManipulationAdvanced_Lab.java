package Lists;

import java.util.*;
import java.util.stream.Collectors;


public class P05ListManipulationAdvanced_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        int index = 0;
        while (!command.contains("end")) {

            if (command.contains("Contains")) {
                int number = Integer.parseInt(command.get(1));
                if (numbersList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.contains("even")) {
                index = 0;
                List<String> numberToPrint = new ArrayList<>();

                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);

                    if (number % 2 == 0) {
                        numberToPrint.add(index, String.valueOf(number));
                        index++;
                    }
                }
                System.out.println(String.join(" ", numberToPrint));
            } else if (command.contains("odd")) {
                index = 0;
                List<String> numberToPrint = new ArrayList<>();
                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    if (number % 2 != 0) {
                        numberToPrint.add(index, String.valueOf(number));
                        index++;
                    }
                }
                System.out.println(String.join(" ", numberToPrint));
            } else if (command.contains("sum")) {
                int sum = 0;
                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    sum += number;
                }
                System.out.println(sum);
            } else if (command.contains("Filter")) {
                String condition = command.get(1);
                int number = Integer.parseInt(command.get(2));
                switch (condition) {

                    case "<":
                        List<String> listToPrint = new ArrayList<>();
                        index = 0;
                        for (int i = 0; i < numbersList.size(); i++) {
                            int element = numbersList.get(i);
                            if (element < number) {
                                listToPrint.add(index, String.valueOf(element));
                                index++;
                            }
                        }
                        System.out.println(String.join(" ", listToPrint));
                        break;
                    case ">":
                        List<String> listToPrint2 = new ArrayList<>();
                        index = 0;
                        for (int i = 0; i < numbersList.size(); i++) {
                            int element = numbersList.get(i);
                            if (element > number) {
                                listToPrint2.add(index, String.valueOf(element));
                                index++;
                            }
                        }
                        System.out.println(String.join(" ", listToPrint2));
                        break;
                    case ">=":
                        List<String> listToPrint3 = new ArrayList<>();
                        index = 0;
                        for (int i = 0; i < numbersList.size(); i++) {
                            int element = numbersList.get(i);
                            if (element >= number) {
                                listToPrint3.add(index, String.valueOf(element));
                                index++;
                            }
                        }

                        System.out.println(String.join(" ", listToPrint3));
                        break;
                    case "<=":
                        List<String> listToPrint4 = new ArrayList<>();
                        index = 0;
                        for (int i = 0; i < numbersList.size(); i++) {
                            int element = numbersList.get(i);
                            if (element <= number) {
                                listToPrint4.add(index, String.valueOf(element));
                                index++;
                            }
                        }
                        System.out.println(String.join(" ", listToPrint4));
                        break;
                }
            }
            command = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        }

    }
}

