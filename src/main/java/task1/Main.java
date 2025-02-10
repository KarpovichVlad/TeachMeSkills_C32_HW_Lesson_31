package task1;

import task1.model.Product;
import task1.service.PriceCalculator;
import task1.strategy.FixedDiscount;
import task1.strategy.LoyalCustomerDiscount;
import task1.strategy.PercentageDiscount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product("Квартира", 100000);
        PriceCalculator calculator = new PriceCalculator();

        System.out.println("Выберите скидку:\n1. Фиксированная ($100)\n2. Процентная (10%)\n3. Для постоянных клиентов (15%)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> calculator.setDiscountStrategy(new FixedDiscount(100));
            case 2 -> calculator.setDiscountStrategy(new PercentageDiscount(10));
            case 3 -> calculator.setDiscountStrategy(new LoyalCustomerDiscount());
            default -> {
                System.out.println("Неверный выбор! Скидка не будет применена.");
                calculator.setDiscountStrategy(null);
            }
        }
        double finalPrice = calculator.calculatePrice(product.getPrice());
        System.out.println("Товар: " + product.getName());
        System.out.println("Цена без скидки: $" + product.getPrice());
        System.out.println("Цена со скидкой: $" + finalPrice);

        sc.close();
    }
}
