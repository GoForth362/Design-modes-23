package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.FileLogger;
import com.study.CP.Factory.product.ILogger;

public class TestingApplication extends Application{
    @Override
    public ILogger createLogger() {
        return new FileLogger("application.log");
    }
}
