package task1.service;

import task1.strategy.DiscountStrategy;

public class PriceCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price) {
        if (discountStrategy == null) {
            return price;
        }
        return discountStrategy.applyDiscount(price);
    }
}
