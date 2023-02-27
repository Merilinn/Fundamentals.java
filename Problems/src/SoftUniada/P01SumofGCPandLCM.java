package SoftUniada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01SumofGCPandLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        List<Integer> nodN = new ArrayList<>();
        List<Integer> nodM = new ArrayList<>();
        List<Integer> nokN = new ArrayList<>();
        List <Integer> nokM = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
                nokN.add(n * i);

            }
            for (int j = 0; j <= 10 ; j++) {
                nokM.add(m * j);

            }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                nodN.add(i);
            }

        }for (int j = 1; j <= m; j++) {
            if (m % j == 0){
                nodM.add(j);
            }

        }
        int nok = 0;
        int nod = 0;
        boolean flagNod = false;
        boolean flagNok = false;
        while (nod == 0){
        for (int i = 0; i < nodN.size(); i++) {
            if (flagNod){
                break;
            }
            for (int j = 0; j < nodM.size(); j++) {
                if (nodM.get(i).equals(nodN.get(j))){
                    nod = nodN.get(i);
                    flagNod = true;
                    break;
                }

            }

        }}
        while (nok == 0){
        for (int i = 0; i < nokN.size(); i++) {
            if (flagNok){
                break;

            }            for (int j = 0; j < nokM.size(); j++) {
                if (nokN.get(i).equals(nokM.get(j))){
                    nok = nokM.get(j);
                    flagNok = true;
                    break;
                }

            }

        }}
        System.out.println(nok + nod);
    }
}
