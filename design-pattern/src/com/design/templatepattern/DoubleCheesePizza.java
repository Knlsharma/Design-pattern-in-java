package com.design.templatepattern;

public class DoubleCheesePizza extends Pizza {
    @Override
    public void chooseBread() {
        System.out.println("Choosing DoubleCheese Pizza Bread!");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding DoubleCheese Pizza Ingredients!");
    }

    @Override
    public void addCheese() {
        System.out.println("Adding Double Cheese!");
    }
}