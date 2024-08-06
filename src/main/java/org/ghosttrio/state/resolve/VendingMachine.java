package org.ghosttrio.state.resolve;

public class VendingMachine {
    private State state;

    public VendingMachine() {
        this.state = new NoCoinState();
    }

    public void insertCoin(int coin) {
        state.increaseCoin(coin, this);
    }
}
