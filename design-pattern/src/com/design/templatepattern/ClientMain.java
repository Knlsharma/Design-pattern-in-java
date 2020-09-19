package com.design.templatepattern;

public class ClientMain {

    public static void main(String[] args) {
        SweetCornPizza pizza1 = new SweetCornPizza();
        pizza1.preparePizza();

        System.out.println("**********");

        MexicanPizza pizza2 = new MexicanPizza();
        pizza2.preparePizza();

        System.out.println("**********");

        NoCheesePizza pizza3 = new NoCheesePizza();
        pizza3.preparePizza();

        System.out.println("**********");

        DoubleCheesePizza pizza4 = new DoubleCheesePizza();
        pizza4.preparePizza();
    }
}
