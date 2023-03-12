package TextProcessing;

import java.util.Scanner;

public class P03ExtractFile_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] inputArr = scan.nextLine().split("\\\\");
        String [] fileArr = inputArr[inputArr.length-1].split("\\.");


        System.out.printf("File name: %s%nFile extension: %s", fileArr[0], fileArr[1]);

    }
}
