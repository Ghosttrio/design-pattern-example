package org.ghosttrio.state.resolve;

public class NoCoinState implements State {
    @Override
    public void increaseCoin(int coin, VendingMachine vm) {
        vm.insertCoin(coin);
    }
}
