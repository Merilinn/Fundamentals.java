package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> planList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String[] command = scan.nextLine().split(":");
        String currentCommand = command[0];

        while (!currentCommand.equals("course start")) {
            String lesson = command[1];
            switch (currentCommand) {
                case "Add":
                    if (!planList.contains(lesson)) {
                        planList.add(lesson);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!planList.contains(lesson)) {
                        planList.add(index, lesson);
                    }
                    break;
                case "Remove":
                    int indexOfLesson = planList.indexOf(lesson);
                    planList.remove(lesson);
                    if (planList.size() >= indexOfLesson + 1) {
                        String nextLesson = planList.get(indexOfLesson);
                        if (nextLesson.startsWith(lesson)) {
                            planList.remove(nextLesson);
                        }
                    }
                    break;
                case "Swap":
                    String lessonToSwap = command[2];
                    if (planList.contains(lesson)) {
                        if (planList.contains(lessonToSwap)) {
                            int firstIndex = planList.indexOf(lesson);
                            int secondIndex = planList.indexOf(lessonToSwap);
                            String exerciseLesson = "";
                            String exerciseLessonToSwap = "";
                            if (firstIndex + 1 < planList.size() && planList.get(firstIndex + 1).startsWith(lesson)){
                                exerciseLesson = planList.get(firstIndex +1);
                            }
                            if (secondIndex + 1 < planList.size() && planList.get(secondIndex + 1).startsWith(lessonToSwap)){
                                exerciseLessonToSwap = planList.get(secondIndex + 1);
                            }
                            if (exerciseLesson.startsWith(lesson)) {

                                planList.remove(lesson);
                                planList.remove(exerciseLesson);
                                if (secondIndex > planList.size()-1){
                                    planList.add(lesson);
                                    planList.add(exerciseLesson);

                                }   else {
                                    planList.add(secondIndex, lesson);
                                planList.add(secondIndex + 1, exerciseLesson);}
                                if (!exerciseLessonToSwap.startsWith(lessonToSwap)){
                                    planList.remove(lessonToSwap);
                                    if (planList.get(firstIndex).contains("Exercise")){
                                        firstIndex = firstIndex + 1;
                                    }
                                    planList.add(firstIndex, lessonToSwap);
                                }
                            }
                            else if (exerciseLessonToSwap.startsWith(lessonToSwap)) {
                                planList.remove(lessonToSwap);
                                planList.remove(exerciseLessonToSwap);
                                if (firstIndex > planList.size()){
                                    planList.add(lessonToSwap);
                                    planList.add(exerciseLessonToSwap);
                                }   else {
                                    planList.add(firstIndex, lessonToSwap);
                                    planList.add(firstIndex + 1, exerciseLessonToSwap);
                                    }
                                if (!exerciseLesson.startsWith(lesson)){
                                    planList.remove(lesson);
                                    planList.add(secondIndex, lesson);
                                }
                            } else if (exerciseLesson.equals("") && exerciseLessonToSwap.equals("")){
                                planList.set(firstIndex, lessonToSwap);
                                planList.set(secondIndex, lesson);
                            }

                        }
                    }
                    break;
                case "Exercise":
                    if (planList.contains(lesson)) {
                        indexOfLesson = planList.indexOf(lesson);
                        planList.add(indexOfLesson + 1, lesson + "-Exercise");
                    } else {
                        planList.add(lesson);
                        planList.add(lesson + "-Exercise");

                    }
                    break;
            }
            command = scan.nextLine().split(":");
            currentCommand = command[0];


        }
        int count = 1;
        for (String lessons : planList) {
            System.out.println(count + "." + lessons);
            count++;

        }
    }
}
//