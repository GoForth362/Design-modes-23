package com.study.CP.Factory.factory;

import com.study.CP.Factory.product.ILogger;

public abstract class Application {
    private final ILogger logger;

    public Application() {
        this.logger = createLogger();
    }

    public abstract ILogger createLogger();

    //业务方法
    public void doSomething(){
        logger.log("doSomething");
    }

}
