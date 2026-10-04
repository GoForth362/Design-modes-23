package com.study.SP.Adapter.New.ex;

import java.util.List;

public class Device {
    private final String name;
    private final List<Voltage> supportedVoltages;

    public Device(String name, List<Voltage> supportedVoltages) {
        this.name = name;
        this.supportedVoltages = supportedVoltages;
    }

    public void startCharging(SmartChargeTarget charger){
        Voltage findVoltage = charger.supplyVoltage(supportedVoltages);
        if (findVoltage != null) {
            System.out.printf("%s: ✔ 当前充电电压为: %s%n", name, findVoltage);
        } else {
            System.out.printf("%s: ❌ 适配器不支持我的任何充电电压%n", name);
        }
    }
}
