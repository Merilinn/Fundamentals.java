package AssociativeArrays;

import java.util.*;

public class P06StudentAcademy_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scan.nextLine();
            double studentGrade = Double.parseDouble(scan.nextLine());
            studentsMap.putIfAbsent(studentName, new ArrayList<>());
            studentsMap.get(studentName).add(studentGrade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            int numberToGrades = entry.getValue().size();
            double sumToGrades = 0.0;
            for (int i = 0; i < entry.getValue().size() + 1; i++) {
                double currentGrade = entry.getValue().get(0);
                sumToGrades += currentGrade;
                entry.getValue().remove(0);
            }
            double finalGrade = sumToGrades / numberToGrades;
            entry.getValue().add(finalGrade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            if (entry.getValue().get(0) >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0));

            }
        }
    }
}
