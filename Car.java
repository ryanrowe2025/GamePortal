import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount(){
        return 0;
    };
}

 class Lamborghini extends Car {
    public static final double DISCOUNT = 0.1;

    public Lamborghini(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}

class Ferrari extends Car {
    public static final double DISCOUNT = 0.15;

    public Ferrari(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}

class Bugatti extends Car {
    public static final double DISCOUNT = 0.3;

    public Bugatti(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}