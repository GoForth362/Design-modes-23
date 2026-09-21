package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.ILogger;
import com.study.CP.Factory.product.RemoteLogger;

public class ProductionApplication extends Application{
    @Override
    public ILogger createLogger() {
        return new RemoteLogger("remote.server.com");
    }
}
