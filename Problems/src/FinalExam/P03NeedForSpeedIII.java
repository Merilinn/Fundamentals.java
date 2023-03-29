package FinalExam;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\|");
            String currentCar = input[0];
            carMap.putIfAbsent(currentCar, new ArrayList<>());
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            carMap.get(currentCar).add(mileage);
            carMap.get(currentCar).add(fuel);
        }
        String[] inputCommand = scan.nextLine().split(" : ");
        String command = inputCommand[0];
        while (!command.equals("Stop")) {

            if (command.equals("Drive")) {
                String car = inputCommand[1];
                int distance = Integer.parseInt(inputCommand[2]);
                int neededFuel = Integer.parseInt(inputCommand[3]);
                int currentFuel = carMap.get(car).get(1);
                if (currentFuel < neededFuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int currentDistance = carMap.get(car).get(0);
                    carMap.get(car).set(0, currentDistance + distance);
                    carMap.get(car).set(1, currentFuel - neededFuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, neededFuel);
                    if (carMap.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        carMap.remove(car);
                    }
                }
            } else if (command.equals("Refuel")) {
                String car = inputCommand[1];
                int fuelToAdd = Integer.parseInt(inputCommand[2]);
                if (carMap.get(car).get(1) + fuelToAdd > 75){
                    fuelToAdd = 75 - carMap.get(car).get(1);
                }
                carMap.get(car).set(1, carMap.get(car).get(1) + fuelToAdd);
                System.out.printf("%s refueled with %d liters%n", car, fuelToAdd);
            } else if (command.equals("Revert")) {
                String car = inputCommand[1];
                int kilometers = Integer.parseInt(inputCommand[2]);
                int currentKilometers = carMap.get(car).get(0);
                if (currentKilometers - kilometers < 10000){
                    carMap.get(car).set(0, 10000);

                }else {
                carMap.get(car).set(0, currentKilometers - kilometers);
                System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);}
            }
            inputCommand = scan.nextLine().split(" : ");
            command = inputCommand[0];

        }
        for (Map.Entry<String, List<Integer>> entry : carMap.entrySet()) {

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }

}
