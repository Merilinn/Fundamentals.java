package Methods;

import java.util.Scanner;

public class P02Grades_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade = scan.nextLine();

        System.out.println(correspondingGrade(grade));

    }
    public static String correspondingGrade (String grade){
    String corresponding = "";
    double gradeD = Double.parseDouble(grade);
        if (gradeD >= 2 && gradeD <= 2.99){
            corresponding = "Fail";
        } else if (gradeD >= 3 && gradeD <= 3.49 ) {
            corresponding = "Poor";
        } else if (gradeD >= 3.50 && gradeD <= 4.49) {
            corresponding = "Good";
        }else if (gradeD >= 4.50 && gradeD <= 5.49){
            corresponding = "Very good";
        } else if (gradeD >= 5.50 && gradeD <= 6.00) {
            corresponding = "Excellent";
            
        }return corresponding;

    }
}
