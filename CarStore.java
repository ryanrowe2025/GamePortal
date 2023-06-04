import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class CarStore implements Game{
    private ArrayList<Car> cars;
    private double discount;

    public CarStore() {
        cars = new ArrayList<Car>();
        cars.add(new Lamborghini("Veneno", 8300000));
        cars.add(new Lamborghini("Sian", 3600000));
        cars.add(new Lamborghini("Miura SVJ", 3600000));
        cars.add(new Ferrari("250 GTO", 70000000));
        cars.add(new Ferrari("335 Sport Scaglietti", 34200000));
        cars.add(new Ferrari("290 MM Spider Scaglietti", 28000000));
        cars.add(new Bugatti("1936 Atlantic", 13000000));
        cars.add(new Bugatti("Centodieci", 14000000));
        cars.add(new Bugatti("La Voiture Noire", 12000000));
        discount = 0;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public String getGameName() {
        return "CarStore";
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void applyDiscount() {
        discount += 0.1;
    }

    public void sellCar(Car car) {
        cars.remove(car);
    }

    public String getScore(){
        return "This game does not keep score.";
    }

    public void writeHighScore(File f){
    }

    
    public void play() {
        CarStore store = new CarStore();
        Scanner scanner = new Scanner(System.in);
        boolean buying = true;

        System.out.println("Welcome to the Car Store!");

        while (buying) {
            System.out.println("Here are the cars we have in stock:");
            for (Car car : store.getCars()) {
                System.out.println(car.getName() + " - $" + car.getPrice());
            }

            System.out.println("Enter the name of the car you would like to buy (or type 'quit' to exit):");
            String carName = scanner.nextLine();

            if (carName.equalsIgnoreCase("quit")) {
                buying = false;
            } else {
                Car carToBuy = null;

                for (Car car : store.getCars()) {
                    if (car.getName().equalsIgnoreCase(carName)) {
                        carToBuy = car;
                        break;
                    }
                }

                if (carToBuy == null) {
                    System.out.println("Sorry, we do not have that car in stock.");
                } else {
                    double discountedPrice = carToBuy.getPrice() * (1 - carToBuy.getDiscount() - store.getDiscount());
                    System.out.println("The price of the car after discount is: $" + discountedPrice);
                    System.out.println("Would you like to buy this car? (yes or no)");
                    String response = scanner.nextLine();

                    if (response.equalsIgnoreCase("yes")) {
                        store.sellCar(carToBuy);
                        System.out.println("Congratulations! You have successfully bought a " + carToBuy.getName() + "!");
                    } else {
                        System.out.println("Thank you for considering buying a car from us.");
                    }
                }
            }
        }

        System.out.println("Thank you for visiting the Car Store. Have a nice day!");
    }
}