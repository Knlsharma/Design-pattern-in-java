package com.design.factorypattern;

/**
 * New York mobile factory is specialized and only sale SpiceFire and SpiceMono.
 */

public class NewYorkMobileFactory extends MobileFactory {

    @Override
    public SpiceMobile constructMobile(String model) {

        SpiceMobile mobile = null;

        if (model.equalsIgnoreCase("SpiceFire")) {
            mobile = new SpicePlus();
            mobile.setPrice(200);
        } else if (model.equalsIgnoreCase("SpiceMono")) {
            mobile = new SpiceFire();
            mobile.setPrice(280);
        }

        return mobile;
    }
}