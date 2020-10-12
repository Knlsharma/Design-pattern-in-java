package com.design.statepattern;

/**
 * @author Kunal Sharma at 12/10/20 10:52 PM
 */

public class GameTest {

    public static void main(String[] args) {

        GameContext context = new GameContext();

        context.setState(new HealthyState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new SurvivalState());
        context.gameAction();
        System.out.println("*****");

        context.setState(new DeadState());
        context.gameAction();
        System.out.println("*****");

    }
}
