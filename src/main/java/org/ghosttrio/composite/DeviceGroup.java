package org.ghosttrio.composite;

import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements Device {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device d) {
        devices.add(d);
    }

    public void removeDevice(Device d) {
        devices.remove(d);
    }

    public void turnOn() {
        for (Device device: devices) {
            device.turnOn(); // 관리하는 Device 객체들에게 실행 위임
        }
    }
}
