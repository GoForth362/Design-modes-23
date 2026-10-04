package com.study.SP.Adapter.New.ex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseholdSocket socket = new HouseholdSocket();
        SmartPowerAdapter powerfulAdapter = new SmartPowerAdapter(socket, List.of(
                new Voltage(15, VoltageType.DC),
                new Voltage(9, VoltageType.DC),
                new Voltage(5, VoltageType.DC)
        ));

        System.out.println("\n=== 场景一: 现代手机 ===");
        Device modernPhone = new Device("iPhone 17", List.of(
                new Voltage(15, VoltageType.DC),
                new Voltage(9, VoltageType.DC),
                new Voltage(5, VoltageType.DC)
        ));
        modernPhone.startCharging(powerfulAdapter);
    }
}
