package AssociativeArrays;

import java.util.*;

public class P08CompanyUsers_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        while (!input.contains("End")){
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            for (int i = 0; i < 2; i++) {
                companyMap.putIfAbsent(company, new ArrayList<>());
                if (!companyMap.get(company).contains(id)){
                companyMap.get(company).add(id);
            }
        }
            input = scan.nextLine();
    }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }

            }
        }

    }
