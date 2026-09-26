package com.study.CP.Prototype.New;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private Map<String, Cloneable<?>> prototypes = new HashMap<>();
    public void registerPrototype(String name, Cloneable<?> prototype) {
        prototypes.put(name, prototype);
    }

    public Cloneable<?> getPrototype(String name) {
        if (prototypes.containsKey(name))
            return prototypes.get(name);
        return null;
    }
}
