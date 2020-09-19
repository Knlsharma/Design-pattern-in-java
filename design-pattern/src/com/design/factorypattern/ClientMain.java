package com.design.factorypattern;

public class ClientMain {

    public static void main(String[] args) {

        MobileFactory factory = new LondonMobileFactory();
        SpiceMobile mobile = factory.produceMobile("SpiceFire");
        System.out.println(mobile.getPrice());


//        MobileFactory nyFactory = new NewYorkMobileFactory();
//        SpiceMobile mobile2 = factory.produceMobile("SpiceMono");
//          Add NULL handling

    }
}
