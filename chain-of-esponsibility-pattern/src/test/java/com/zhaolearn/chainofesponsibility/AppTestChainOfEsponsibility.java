package com.zhaolearn.chainofesponsibility;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestChainOfEsponsibility {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    @Test
    public void appTestChainOfEsponsibility() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an INFO.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level DEBUG.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error DEBUG.");
    }
}
