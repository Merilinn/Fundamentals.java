package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Integer> numberList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <String> command = Arrays.asList(scan.nextLine().split(" "));

        while (!command.contains("end")){
            if (command.contains("Delete")){
            int element = Integer.parseInt(command.get(1));
                   numberList.removeAll(Arrays.asList(element));


                }if (command.contains("Insert")){
                    int element = Integer.parseInt(command.get(1));
                    int position = Integer.parseInt(command.get(2));
                    numberList.add(position, element);

                } command = Arrays.asList(scan.nextLine().split(" "));
            }for (Integer number : numberList) {
            System.out.print(number + " ");

        }


        }

    }

