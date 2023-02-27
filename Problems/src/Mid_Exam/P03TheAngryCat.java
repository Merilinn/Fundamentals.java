package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TheAngryCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> ratingList = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String leftOrRight = "";
        int sumLeft = 0;
        int sumRight = 0;
        if (type.equals("cheap")) {
            int currentElement = ratingList.get(entryPoint);
            for (int i = 0; i < entryPoint; i++) {
                int currentNumber = ratingList.get(i);
                if (currentNumber < currentElement){
                    sumLeft += currentNumber;
                }}
                for (int j = entryPoint+1; j < ratingList.size(); j++) {
                  int  currentNumber = ratingList.get(j);
                    if (currentNumber < currentElement){
                        sumRight += currentNumber;
                    }
                }

            if (sumLeft >= sumRight){
                leftOrRight = "Left";
                System.out.printf("%s - %d", leftOrRight, sumLeft);
            }else {
                leftOrRight = "Right";
                System.out.printf("%s - %d", leftOrRight, sumRight);
            }
        } else if (type.equals("expensive")) {
            int currentElement = ratingList.get(entryPoint);
            for (int i = 0; i < entryPoint; i++) {
                int currentNumber = ratingList.get(i);
                if (currentNumber >= currentElement){
                    sumLeft += currentNumber;
                }}
                for (int j = entryPoint+1; j < ratingList.size(); j++) {
                   int currentNumber = ratingList.get(j);
                    if (currentNumber >= currentElement){
                        sumRight += currentNumber;
                    }
                }

            if (sumLeft >= sumRight){
                leftOrRight = "Left";
                System.out.printf("%s - %d", leftOrRight, sumLeft);
            }else {
                leftOrRight = "Right";
                System.out.printf("%s - %d", leftOrRight, sumRight);
            }
        }
    }
}
