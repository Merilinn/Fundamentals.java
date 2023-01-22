package DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yield = Integer.parseInt(scan.nextLine());
        int days = 0;
        int sum = 0;

        while (yield >= 100){
            days++;
            sum += yield - 26;
            yield -= 10;

        }
        if (sum >= 26){
        sum -= 26;
        System.out.printf("%d%n%d", days, sum);}
        else {
            System.out.printf("%d%n%d", days, sum);
        }
    }
}
