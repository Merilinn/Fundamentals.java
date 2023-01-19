package BasicSyntax.BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int allMin = (hour * 60) + min + 30;
        int newHour = allMin / 60;
        int newMin = allMin % 60;
        if (newHour == 24){
            newHour = 0;
        }

        System.out.printf("%d:%02d", newHour, newMin);
    }
}
