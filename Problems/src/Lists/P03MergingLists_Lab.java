package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        int n = 0;
        List <Integer> biggerList = new ArrayList<>();
        if (firstList.size() < secondList.size()) {
            n = firstList.size();
            biggerList = secondList;
        } else {
            n = secondList.size();
            biggerList = firstList;
        }
        int index = 0;
        for (int i = 0; i < n; i++) {

            resultList.add(index, firstList.get(i));
            index++;
            resultList.add(index, secondList.get(i));
            index++;
        }
        for (int i = index / 2; i < biggerList.size(); i++) {

            resultList.add(index, biggerList.get(i));
            index++;

        }
        for (Integer element : resultList) {
            System.out.print(element + " ");

        }


    }
}

