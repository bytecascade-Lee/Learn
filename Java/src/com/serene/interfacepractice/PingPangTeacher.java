package com.serene.interfacepractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class PingPangTeacher extends Teacher implements English{
    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在教运动员打乒乓球");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在说英语");
    }
}
