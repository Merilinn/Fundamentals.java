package AssociativeArrays;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class P03OddOccurrences_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] wordArr = scan.nextLine().toLowerCase().split(" ");

        Map <String, Integer> wordMap = new LinkedHashMap<>();
        for (String word : wordArr) {
            Integer countMap = wordMap.get(word);
            if (!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            }   else {
                wordMap.put(word, countMap + 1);
            }
        }
        List <String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddWords));


    }
}
