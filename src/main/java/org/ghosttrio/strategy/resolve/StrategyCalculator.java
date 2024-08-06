package org.ghosttrio.strategy.resolve;

import org.ghosttrio.strategy.problem.Item;

import java.util.List;

public class StrategyCalculator {

    private final DiscountStrategy discountStrategy;

    public StrategyCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public int calculate(boolean firstGuest, List<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }
}
