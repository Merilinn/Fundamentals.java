package FinalExam;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        String [] command = scan.nextLine().split("\\|");
        String currentCommand = command[0];
        StringBuilder decryptCode = new StringBuilder();
        decryptCode.append(code);
        while (!currentCommand.equals("Decode")){
            if (currentCommand.equals("Move")){
                int numberOfLetters = Integer.parseInt(command[1]);
                for (int i = 0; i < numberOfLetters; i++) {
                    char currentSymbol = decryptCode.charAt(0);
                    decryptCode.append(currentSymbol);
                    decryptCode.deleteCharAt(0);
                }
            } else if (currentCommand.equals("Insert")) {
                int index = Integer.parseInt(command[1]);
                String elementToInsert = command[2];
                decryptCode.insert(index, elementToInsert);
                
            } else if (currentCommand.equals("ChangeAll")) {
                String toReplace = command[1];
                String replacement = command[2];
                int indexToReplace = decryptCode.indexOf(toReplace);
                while (indexToReplace != -1) {
                    decryptCode.replace(indexToReplace, indexToReplace, replacement).deleteCharAt(indexToReplace+1);
                    indexToReplace = decryptCode.indexOf(toReplace);
                }
            }

            command = scan.nextLine().split("\\|");
            currentCommand = command[0];
        }
        System.out.println("The decrypted message is: " + decryptCode);
    }
}
