package com.study.SP.Adapter.New.ex;

import java.util.List;

public class SmartPowerAdapter implements SmartChargeTarget {
    private final HouseholdSocket adaptee;
    private final List<Voltage> adapterSupportedVoltages;

    public SmartPowerAdapter(HouseholdSocket adaptee, List<Voltage> supportedVoltages) {
        this.adaptee = adaptee;
        this.adapterSupportedVoltages = supportedVoltages;
        System.out.println("-> 适配器已创建，支持输出: " + this.adapterSupportedVoltages);
    }

    //找到设备和适配器都支持的电压
    private Voltage findBestVoltageMatch(List<Voltage> deviceVoltages) {
        for (Voltage deviseVoltage : deviceVoltages) {
            if (adapterSupportedVoltages.contains(deviseVoltage)) {
                return deviseVoltage;
            }
        }
        return null;
    }

    //转换过程
    private Voltage convert(Voltage dcOutput) {
        Voltage acInput = adaptee.supply();
        System.out.printf("适配器：将 %s 转换为 %s/n", acInput, dcOutput);
        return dcOutput;
    }

    //匹配过程
    @Override
    public Voltage supplyVoltage(List<Voltage> deviceSupportedVoltages) {
        Voltage bestMatch = findBestVoltageMatch(deviceSupportedVoltages);
        if (bestMatch != null){
            System.out.println("适配器: 协商成功，匹配到最佳电压: " + bestMatch);
            return convert(bestMatch);
        } else {
            System.out.println("适配器: 协商失败，没有找到双方都支持的电压模式。");
            return null;
        }
    }
}
