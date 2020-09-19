package com.design.factorypattern;
/**
 * London mobile factory is specialized and only sale SpiceFire and SpiceBolt.
 */
public class LondonMobileFactory extends MobileFactory {

    @Override
    public SpiceMobile constructMobile(String model) {

        SpiceMobile mobile = null;

        if (model.equalsIgnoreCase("SpiceFire")) {
            mobile = new SpicePlus();
            mobile.setPrice(300);
        } else if (model.equalsIgnoreCase("SpiceBolt")) {
            mobile = new SpiceBolt();
            mobile.setPrice(400);
        }

        return mobile;
    }
}