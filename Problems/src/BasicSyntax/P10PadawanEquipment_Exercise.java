package BasicSyntax;

import java.util.Scanner;

public class P10PadawanEquipment_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double priceLightsaber = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());
        double countLight = Math.ceil (students + (students * 0.10));

        if (students >= 6){
                int minusBelt = students - (students / 6) ;
            double neededMoney = (students * priceRobe) + (countLight * priceLightsaber) + (minusBelt * priceBelt);
            if (money >= neededMoney){
                System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
            } else {
                System.out.printf("George Lucas will need %.2flv more.", Math.abs(neededMoney - money));

            }
        }else {
            double neededMoney = (students * priceRobe) + (countLight * priceLightsaber) + (students * priceBelt);
            if (money >= neededMoney){
                System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
            } else {
                System.out.printf("George Lucas will need %.2flv more.", Math.abs(neededMoney - money));

            }


        }

    }
}
