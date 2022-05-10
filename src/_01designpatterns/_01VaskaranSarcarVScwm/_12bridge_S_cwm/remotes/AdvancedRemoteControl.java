package _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.remotes;

import _01designpatterns._01VaskaranSarcarVScwm._12bridge_S_cwm.devices.Device;

/**
 * Created by Gra_m on 2022 03 18
 */

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number){
        device.setChannel(number);
    };
}
