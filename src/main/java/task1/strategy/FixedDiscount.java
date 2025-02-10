package task1.strategy;

public class FixedDiscount implements DiscountStrategy {
    private final double discount;


    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - discount);
    }
}
