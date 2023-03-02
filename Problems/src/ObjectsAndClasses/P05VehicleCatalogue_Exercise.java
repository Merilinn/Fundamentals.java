package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05VehicleCatalogue_Exercise {
    static class Catalogue {
        String type;
        String model;
        String color;
        int horsePower;

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public Catalogue(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Catalogue> catalogueList = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsePower = Integer.parseInt(input.split(" ")[3]);
            Catalogue vehicle = new Catalogue(type.substring(0, 1).toUpperCase() + type.substring(1), model, color, horsePower);
            catalogueList.add(vehicle);
            input = scan.nextLine();
        }
        String inputCommand = scan.nextLine();
        while (!inputCommand.equals("Close the Catalogue")) {
            String modelToPrint = inputCommand;
            for (int i = 0; i < catalogueList.size(); i++) {
                String currentModel = catalogueList.get(i).getModel();
                if (currentModel.equals(modelToPrint)) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                            catalogueList.get(i).getType(),
                            catalogueList.get(i).getModel(), catalogueList.get(i).getColor(), catalogueList.get(i).getHorsePower());
                }
            }
            inputCommand = scan.nextLine();
        }
        List<Catalogue> carList = new ArrayList<>();
        List<Catalogue> truckList = new ArrayList<>();
        double averageCarPower = 0;
        double averageTruckPower = 0;
        for (Catalogue vehicle : catalogueList) {
            if (vehicle.getType().equals("Car")) {
                carList.add(vehicle);
                averageCarPower += vehicle.getHorsePower();
            } else {
                truckList.add(vehicle);
                averageTruckPower += vehicle.getHorsePower();
            }
        }
        averageCarPower = averageCarPower / carList.size();
        averageTruckPower = averageTruckPower / truckList.size();
        if (carList.size() == 0){
            averageCarPower = 0.0;
        } else if (truckList.size() == 0) {
            averageTruckPower = 0.0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarPower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckPower);

    }
}


