package com.study.SP.Adapter.New.ex;

public class HouseholdSocket {
    public Voltage supply(){
        System.out.println("家用插座: 提供 -> 220V AC");
        return new Voltage(220, VoltageType.AC);
    }
}
