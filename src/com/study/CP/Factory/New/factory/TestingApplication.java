package com.study.CP.Factory.New.factory;

import com.study.CP.Factory.New.product.FileLogger;
import com.study.CP.Factory.New.product.ILogger;

public class TestingApplication extends Application {
    @Override
    public ILogger createLogger() {
        return new FileLogger("application.log");
    }
}
