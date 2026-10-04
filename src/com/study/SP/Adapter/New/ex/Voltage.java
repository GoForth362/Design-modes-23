package com.study.SP.Adapter.New.ex;
import java.util.Objects;

public class Voltage {
    int value;
    VoltageType type;

    Voltage(int value, VoltageType type){
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return value + "V" + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voltage)) return false;
        Voltage v = (Voltage) o;
        return value == v.value && type == v.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
