package Mid_Exam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCity = Integer.parseInt(scan.nextLine());
        int countCity = 0;
        int countRain = 0;
        double totalProfit = 0;

        while (numberOfCity > 0) {

            String nameOfCity = scan.nextLine();
            countCity++;
            countRain++;
            double income = Double.parseDouble(scan.nextLine());
            double expenses = Double.parseDouble(scan.nextLine());
            if (countCity == 3 && countRain !=5) {
                expenses += expenses * 0.5;
                countCity = 0;
            }
            if (countRain == 5) {
                income -= income * 0.1;
                countRain = 0;
            }
            double profit = income - expenses;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameOfCity, profit);
            totalProfit += profit;
            profit = 0;


            numberOfCity--;

        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
