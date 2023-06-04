public class Lamborghini extends Car {
    public static final double DISCOUNT = 0.1;

    public Lamborghini(String name, double price) {
        super(name, price);
    }

    public double getDiscount() {
        return DISCOUNT;
    }
}