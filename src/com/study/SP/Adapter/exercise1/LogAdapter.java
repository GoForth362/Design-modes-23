package com.study.SP.Adapter.exercise1;

import java.util.Objects;

//LogAdapter实现了原来系统的目标接口，同时持有三方库NbLogger的引用。
public class LogAdapter implements LogFactory {
    private NbLogger nbLogger;

    public LogAdapter(NbLogger nbLogger) {
        this.nbLogger = nbLogger;
    }

    @Override
    public void debug(String tag, String message) {
        Objects.requireNonNull(nbLogger);
        nbLogger.d(1, message);
    }
}
