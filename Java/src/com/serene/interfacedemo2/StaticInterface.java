package com.serene.interfacedemo2;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/1
 */
public interface StaticInterface {
    // 接口中静态方法的注意事项：
    // 静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
    // 静态方法不能被重写
    // public可以省略，static不能省略
    public static void staticinterface() {
        System.out.println("这是静态接口");
    }

}
