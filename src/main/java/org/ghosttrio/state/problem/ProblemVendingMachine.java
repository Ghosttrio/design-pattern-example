package org.ghosttrio.state.problem;

public class ProblemVendingMachine {

    public static enum State {NOCOIN, SELECTABLE}

    private State state = State.NOCOIN;


    public void insertCoin(int coin) {
        switch (state) {
            case NOCOIN -> {
                insertCoin(coin);
                state = State.SELECTABLE;
                break;
            }
            case SELECTABLE -> insertCoin(coin);
        }
    }
}
