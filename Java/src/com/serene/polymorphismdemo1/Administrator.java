package com.serene.polymorphismdemo1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Administrator extends Person {
    public Administrator() {
    }

    public Administrator(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void show() {
        System.out.println("管理员信息是:\nid:" + this.getId() + "\n姓名:" +
                this.getName() + "\n年龄:" + this.getAge());
    }
}
