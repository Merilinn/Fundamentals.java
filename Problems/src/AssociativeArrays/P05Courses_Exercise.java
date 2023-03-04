package AssociativeArrays;

import java.util.*;

public class P05Courses_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<String, List<String>> courseMap = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            courseMap.putIfAbsent(courseName, new ArrayList<>());
            courseMap.get(courseName).add(studentName);

            input = scan.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            int numberStudents = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), numberStudents);
            for (int i = 0; i < entry.getValue().size(); i++) {
                String currentStudent = entry.getValue().get(i);
                System.out.printf("-- %s%n", currentStudent);

            }
        }
    }
}
