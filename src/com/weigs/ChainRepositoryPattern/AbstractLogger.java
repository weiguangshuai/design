package com.weigs.ChainRepositoryPattern;

/**
 * @author weigs
 * @date 2017/7/19 0019
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = nextLogger;
    }


}
