package DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String townName = scan.nextLine();
        long population = Long.parseLong(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());

        String result = String.format("Town %s has population of %d and area %d square km.", townName, population, area);
        System.out.println(result);
    }
}
