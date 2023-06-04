public class Ferrari extends Car {
    public static final double DISCOUNT = 0.15;

    public Ferrari(String name, double price) {
        super(name, price);
    }

    public double getDiscount() {
        return DISCOUNT;
    }
}
