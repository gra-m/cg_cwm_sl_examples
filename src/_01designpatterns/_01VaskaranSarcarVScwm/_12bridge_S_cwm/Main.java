package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm;

import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices.LgTv;
import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices.SonyTv;
import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.remotes.AdvancedRemoteControl;

/**
 * Created by Gra_m on 2022 03 18
 *
 * Use the bridge pattern when you have hierarchy that can grow in two different dimensions. Split them and allow them to
 * grow independently.
 */

public class Main {
    public static void main(String[] args) {
        var advRemoteControl = new AdvancedRemoteControl(new SonyTv());
        advRemoteControl.turnOn();
        advRemoteControl.turnOff();
        advRemoteControl.setChannel(4);

        var RemoteControl = new AdvancedRemoteControl(new LgTv());
        RemoteControl.turnOn();
        RemoteControl.turnOff();

    }
}
