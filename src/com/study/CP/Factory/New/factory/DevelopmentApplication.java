package com.study.CP.Factory.New.factory;

import com.study.CP.Factory.New.product.ConsoleLogger;
import com.study.CP.Factory.New.product.ILogger;

public class DevelopmentApplication extends Application {
    @Override
    public ILogger createLogger() {
        return new ConsoleLogger();
    }
}
