package com.design.statepattern;

/**
 * @author Kunal Sharma at 12/10/20 10:55 PM
 */
public class DeadState implements PlayerState {

    @Override
    public void action(Player p) {
        p.dead();
    }
}
