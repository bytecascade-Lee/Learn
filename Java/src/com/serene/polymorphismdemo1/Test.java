package com.serene.polymorphismdemo1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {
        Administrator administrator = new Administrator("001", "张三", 40);
        register(administrator);

        Teacher teacher = new Teacher("002", "李四", 34);
        register(teacher);

        Student student = new Student("004", "赵六", 17);
        register(student);
    }


    // 写一个注册方法，要求既能接收老师，还能接收学生，也能接收管理员
    // 则形参类型必须是这三个类的父类，即Person
    // 此处必须使用static修饰的静态方法，因为main方法是静态的
    // 静态方法有一个重要限制：只能直接调用本类中的静态成员（静态方法或静态变量）
    // 不能直接调用非静态成员（包括非静态方法）。
    public  static void register(Person person) {
        person.show();
    }

}
