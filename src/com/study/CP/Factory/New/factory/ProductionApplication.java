package com.study.CP.Factory.New.factory;

import com.study.CP.Factory.New.product.ILogger;
import com.study.CP.Factory.New.product.RemoteLogger;

public class ProductionApplication extends Application {
    @Override
    public ILogger createLogger() {
        return new RemoteLogger("remote.server.com");
    }
}
