package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.ConsoleLogger;
import com.study.CP.Factory.product.ILogger;

public class DevelopmentApplication extends Application{
    @Override
    public ILogger createLogger() {
        return new ConsoleLogger();
    }
}
