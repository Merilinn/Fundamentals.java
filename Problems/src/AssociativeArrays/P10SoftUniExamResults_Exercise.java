package AssociativeArrays;

import java.util.*;

public class P10SoftUniExamResults_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> courseList = new ArrayList<>();
        Map<String, Integer> examMap = new LinkedHashMap<>();
        while (!input.contains("exam finished")) {
            String name = input.split("-")[0];
            String course = input.split("-")[1];
            if (!course.equals("banned")) {
                courseList.add(course);
            }
            if (course.equals("banned")) {
                examMap.remove(name);
            } else {
                int points = Integer.parseInt(input.split("-")[2]);
                examMap.putIfAbsent(name, points);
                if (examMap.get(name) < points) {
                    examMap.put(name, points);
                }
            }
            input = scan.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : examMap.entrySet()) {

            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        Map<String, Integer> courseMap = new LinkedHashMap<>();
        for (int i = 0; i < courseList.size(); i++) {
            String currentCourse = courseList.get(i);
            if (!courseMap.containsKey(currentCourse)) {
                courseMap.put(currentCourse, 1);
            } else {
                int currentCount = courseMap.get(currentCourse);
                courseMap.put(currentCourse, currentCount + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : courseMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
