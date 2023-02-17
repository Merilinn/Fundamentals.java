package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 //1 2 3 |4 5 6 |  7  8
        List<String> arraysAtList = Arrays.stream(scan.nextLine().replaceAll("\\s+"," ").split("\\|")).collect(Collectors.toList());

        List <String> resultList = new ArrayList<>();
        int currentIndex = arraysAtList.size()-1;


        while (currentIndex >= 0){
            resultList.add(arraysAtList.get(currentIndex));

            currentIndex--;

        }
        System.out.print(resultList.toString().replace("[", "").replace("]", "").trim().
               replaceAll(", ", " ").replaceAll("\\s+", " "));

    }
}
