package task1.strategy;

public class LoyalCustomerDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}
