package MidExam;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstEmployer = Integer.parseInt(scan.nextLine());
        int secondEmployer = Integer.parseInt(scan.nextLine());
        int thirdEmployer = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());

        int sumForHour = firstEmployer + secondEmployer + thirdEmployer;
        int countHours = 0;
        while (students > 0){
            if (countHours == 4 || countHours == 8 || countHours == 12 || countHours == 16){
                countHours += 1;

            }
            if (sumForHour >= students) {
                countHours += 1;

            }
            students = students - sumForHour;
            countHours++;



        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
