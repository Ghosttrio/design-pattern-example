package org.ghosttrio.strategy.resolve;

import org.ghosttrio.strategy.problem.Item;

public interface DiscountStrategy {
    int getDiscountPrice(Item item);
}
