package Arrays;

import java.util.Scanner;

public class P10TreasureHunt_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lootArr = scan.nextLine().split("\\|");
        String[] newLoot = {};
        String[] command = scan.nextLine().split(" ");
        String currentCommand = command[0];
        boolean isThatItemToTheChest = true;


        while (!currentCommand.equals("Yohoho!")) {
            switch (currentCommand) {
                case "Loot":
                    String currentItem = "";
                    for (int i = 1; i < command.length; i++) {
                        currentItem = command[i];

                        for (int j = 0; j < lootArr.length; j++) {

                            String itemInChest = lootArr[j];
                            if (j + 1 < lootArr.length) {

                                if (!itemInChest.equals(currentItem)) {
                                    isThatItemToTheChest = false;
                                } else {
                                    isThatItemToTheChest = true;
                                    break;
                                }
                            } else if (!isThatItemToTheChest) {


                                newLoot = new String[lootArr.length + 1];
                                newLoot[0] = currentItem;
                                for (int k = 1; k < newLoot.length; k++) {
                                    newLoot[k] = lootArr[k - 1];

                                }
                                lootArr = newLoot;
                                break;
                            }
                        }
                    }
                    break;
                case "Drop":
                    int currentIndex = Integer.parseInt(command[1]);

                    if (currentIndex >= lootArr.length || currentIndex < 0) {
                        break;
                    }
                    String currentLoot = lootArr[currentIndex];
                    for (int i = currentIndex; i < lootArr.length - 1; i++) {
                        lootArr[i] = lootArr[i + 1];
                        if (i + 1 == lootArr.length - 1) {
                            lootArr[lootArr.length - 1] = currentLoot;
                        }
                    }
                    break;
                case "Steal":
                    int countToSteal = Integer.parseInt(command[1]);

                    if (countToSteal > lootArr.length) {
                        countToSteal = lootArr.length;
                    }//3 -5
                    String steal = "";
                    for (int i = lootArr.length - countToSteal; i < lootArr.length; i++) {
                        steal = lootArr[i];

                        if (i + 1 == lootArr.length){
                            System.out.print(steal);
                            break;
                        }
                        System.out.print(steal + ", ");


                    }
                    System.out.println();
                    newLoot = new String[lootArr.length - countToSteal];
                    for (int i = 0; i < newLoot.length; i++) {
                        newLoot[i] = lootArr[i];
                    }
                    lootArr = newLoot;


            }
            command = scan.nextLine().split(" ");
            currentCommand = command[0];

        }
        double sum = 0;
        int count = 0;
        for (int i = 0; i < lootArr.length; i++) {
            sum++;
            String loot = lootArr[i];
            for (int j = 0; j < loot.length(); j++) {
                count++;

            }

        }
        if (lootArr.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double gain = count / sum;
            System.out.printf("Average treasure gain: %.2f pirate credits.", gain);

        }
    }
}

