package DataTypesAndVariables;

import java.util.Scanner;

public class P01IntegerOperations_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toDo = 0;
        int sum = 0;

        while (toDo < 3){
            int firstNum = Integer.parseInt(scan.nextLine());
            int secondNum = Integer.parseInt(scan.nextLine());
            sum += firstNum + secondNum;
            toDo++;
            int thirdNum = Integer.parseInt(scan.nextLine());
            sum = sum / thirdNum;
            toDo++;
            int fourNum = Integer.parseInt(scan.nextLine());
            sum = sum * fourNum;
            toDo++;

        }
        System.out.println(sum);
    }
}
