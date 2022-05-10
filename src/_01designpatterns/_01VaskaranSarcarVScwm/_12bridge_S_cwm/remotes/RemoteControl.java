package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.remotes;

import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices.Device;

/**
 * Created by Gra_m on 2022 03 18
 */

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
