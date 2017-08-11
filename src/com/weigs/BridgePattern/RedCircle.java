package com.weigs.BridgePattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:red, radius:"
                +radius+",x:"+x+",y:"+y+"]");
    }
}
