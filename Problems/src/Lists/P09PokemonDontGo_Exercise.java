package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pokeList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (pokeList.size() > 0) {
            int index = Integer.parseInt(scan.nextLine());
            if (index < 0) {
                index = 0;
                sum += pokeList.get(0);
                int workNum = pokeList.get(0);
                pokeList.set(0, pokeList.get(pokeList.size() - 1));
                for (int i = 0; i < pokeList.size(); i++) {
                    int currentElement = pokeList.get(i);
                    if (currentElement <= pokeList.get(0)) {
                        pokeList.set(i, currentElement + workNum);
                    } else {
                        pokeList.set(i, currentElement - workNum);

                    }
                }


            } else if (index > pokeList.size() - 1) {
                index = pokeList.size() - 1;
                sum += pokeList.get(pokeList.size() - 1);
                for (int i = 0; i < pokeList.size(); i++) {
                    int currentElement = pokeList.get(i);
                    if (currentElement <= pokeList.get(index)) {
                        pokeList.set(i, currentElement + pokeList.get(index));
                    } else {
                        pokeList.set(i, currentElement - pokeList.get(index));

                    }
                }
                pokeList.set(pokeList.size() - 1, pokeList.get(0));
            } else {
                int elementToRemove = pokeList.get(index);
                int workNumber = elementToRemove;
                pokeList.remove(index);
                sum += workNumber;
                for (int i = 0; i < pokeList.size(); i++) {
                    int currentElement = pokeList.get(i);
                    if (currentElement <= workNumber) {
                        pokeList.set(i, currentElement + workNumber);
                    } else {
                        pokeList.set(i, currentElement - workNumber);

                    }


                }

            }
        }
        System.out.println(sum);
    }
}
