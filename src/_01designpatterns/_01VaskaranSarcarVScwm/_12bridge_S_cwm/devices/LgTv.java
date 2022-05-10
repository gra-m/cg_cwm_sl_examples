package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices;

/**
 * Created by Gra_m on 2022 03 18
 */

public class LgTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("LG: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("LG: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("LG: setChannel " + number);
    }
}
