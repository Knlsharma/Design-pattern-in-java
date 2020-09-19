package com.design.factorypattern;

public abstract class SpiceMobile {
    public double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void prepare();

    public abstract void bundle();

    public abstract void label();
}
