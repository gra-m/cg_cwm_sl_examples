package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices;

import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices.Device;

/**
 * Created by Gra_m on 2022 03 18
 */

public class SonyTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel " + number);
    }
}
