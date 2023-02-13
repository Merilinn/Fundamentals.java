package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Integer> numbersList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> resultList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber = numbersList.get(i);
            if (currentNumber >= 0){
                resultList.add(currentNumber);
            }
        }if (resultList.size() == 0){
            System.out.println("empty");
        }else {
            Collections.reverse(resultList);
            System.out.println(String.join(" ", String.valueOf(resultList)
                    .replace("[", "").replace("]", "").replaceAll(", ", " ")));

        }    }
}
