package ObjectAndClassesExercise.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<CarClass.Car> cars = new ArrayList<>();
        List<TrucksClass.Truck> trucks = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int hp = Integer.parseInt(input.split(" ")[3]);
            if (type.equals("car")) {
                CarClass.Car car = new CarClass.Car(type, model, color, hp);
                cars.add(car);
            } else {
                TrucksClass.Truck truck = new TrucksClass.Truck(type, model, color, hp);
                trucks.add(truck);
            }


            input = scanner.nextLine();
        }
        while (!input.equals("Close the Catalogue")) {
            String car = input;

                for (TrucksClass.Truck truck : trucks) {
                    if (truck.getModel().equals(car)) {
                        System.out.printf(
                                "Type: Truck%n" +
                                        "Model: %s%n" +
                                        "Color: %s%n" +
                                        "Horsepower: %d%n"
                                , truck.getModel(), truck.getColor(), truck.getHp());
                    }
                }

                for (CarClass.Car car1 : cars) {
                    if (car1.getModel().equals(input)) {
                        System.out.printf(
                                "Type: Car%n" +
                                        "Model: %s%n" +
                                        "Color: %s%n" +
                                        "Horsepower: %d%n"
                                , car1.getModel(), car1.getColor(), car1.getHp());
                    }
                }



            input = scanner.nextLine();
        }
        double hpCars = 0;
        double hpTrucks = 0;
        for (TrucksClass.Truck truck : trucks) {
            hpTrucks += truck.getHp();
        }
        for (CarClass.Car car : cars) {
            hpCars += car.getHp();
        }


        if (hpTrucks == 0) {
            hpTrucks = 0.0;
        } else {
            hpTrucks = hpTrucks / trucks.size();
        }
        if (hpCars <= 0) {
            hpCars = 0.0;
        } else {
            hpCars = hpCars / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n" +
                "Trucks have average horsepower of: %.2f.%n", hpCars, hpTrucks);
    }
}
