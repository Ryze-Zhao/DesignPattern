package com.zhaolearn.chainofesponsibility.old;
/**
 * 日志中：分为INFO、DEBUG、ERROR等3种级别，如果出现ERROR就会ERROR、DEBUG和INFO中一起输出；如果出现DEBUG就传递到DEBUG和INFO输出，ERROR不输出；如果出现INFO级别的信息，就传递到INFO才输出。
 * @author: HeHaoZhao
 * @date: 2020/2/13 12:06
 */
public class DemoMain {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an INFO.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level DEBUG.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error DEBUG.");
    }
}
