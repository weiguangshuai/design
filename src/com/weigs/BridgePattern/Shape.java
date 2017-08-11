package com.weigs.BridgePattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    protected abstract void draw();
}
