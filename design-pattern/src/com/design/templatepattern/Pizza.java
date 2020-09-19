package com.design.templatepattern;

public abstract class Pizza {
    public abstract void chooseBread();
    public abstract void addIngredients();

    public void heating() {
        System.out.println("Heating for 10 minutes!");
    }

    public void addTopinngs() {
        System.out.println("Adding Topinngs!");
    }

    public void addCheese() {
        System.out.println("Adding Cheese!");
    }

    public boolean isCheese(){
        return true;
    }

    // Template method
    public final void preparePizza() {
        chooseBread();
        addIngredients();
        heating();
        if(isCheese()) {
            addCheese();
        }
        addTopinngs();
    }
}