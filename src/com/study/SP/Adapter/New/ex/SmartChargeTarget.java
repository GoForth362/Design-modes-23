package com.study.SP.Adapter.New.ex;

import java.util.List;

public interface SmartChargeTarget {
    Voltage supplyVoltage(List<Voltage> deviceSupportedVoltages);
}
