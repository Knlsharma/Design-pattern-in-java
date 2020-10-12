package com.design.statepattern;

/**
 * @author Kunal Sharma at 12/10/20 10:55 PM
 */

public class HealthyState implements PlayerState {

    @Override
    public void action(Player p) {
        p.attack();
        p.fireBumb();
        p.fireGunblade();
        p.fireLaserPistol();
    }
}
