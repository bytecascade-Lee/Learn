package com.serene.codeblockdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class StaticCodeBlock {
    private String id;
    private String name;
    private int age;

    static {
        System.out.println("开始创建对象了");
    }

    public StaticCodeBlock() {
        System.out.println("空参构造");
    }

    public StaticCodeBlock(String id, String name, int age) {
        System.out.println("全部参数构造");
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
