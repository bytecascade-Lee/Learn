package com.serene.interfacedemo2;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/1
 */
public interface DefaultInterface {
    public default void defaultinterface() {
        System.out.println("这是默认接口");
    }
}
