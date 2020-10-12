package com.design.statepattern;

/**
 * @author Kunal Sharma at 12/10/20 10:54 PM
 */

public class GameContext {

    private PlayerState state = null;
    private Player player = new Player();

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void gameAction() {
        state.action(player);
    }
}
