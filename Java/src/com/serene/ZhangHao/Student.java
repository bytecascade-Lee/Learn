package com.serene.ZhangHao;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/24
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 3192028735074489238L;
    private String id;
    private String name;
    private int total;
    private int chinese;
    private int math;
    private int english;
    private int physics;
    private int chemistry;
    private int biology;


    public Student() {
    }

    public Student(String[] array) {
        this.id = array[0];
        this.name = array[1];
        this.chinese = Integer.parseInt(array[2]);
        this.math = Integer.parseInt(array[3]);
        this.english = Integer.parseInt(array[4]);
        this.physics = Integer.parseInt(array[5]);
        this.chemistry = Integer.parseInt(array[6]);
        this.biology = Integer.parseInt(array[7]);
        this.total = chinese + math + english + physics + chemistry + biology;
    }

    public Student(String id, String name, int chinese, int math, int english, int physics, int chemistry, int biology) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.total = chinese + math + english + physics + chemistry + biology;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 设置
     *
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    /**
     * 获取
     *
     * @return physics
     */
    public int getPhysics() {
        return physics;
    }

    /**
     * 设置
     *
     * @param physics
     */
    public void setPhysics(int physics) {
        this.physics = physics;
    }

    /**
     * 获取
     *
     * @return chemistry
     */
    public int getChemistry() {
        return chemistry;
    }

    /**
     * 设置
     *
     * @param chemistry
     */
    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    /**
     * 获取
     *
     * @return biology
     */
    public int getBiology() {
        return biology;
    }

    /**
     * 设置
     *
     * @param biology
     */
    public void setBiology(int biology) {
        this.biology = biology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, total, chinese, math, english, physics, chemistry, biology);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // 判断是否相同时，不必考虑成绩，只要学号相同，则必定为同一个人
        String id1 = ((Student) o).id;
        return Objects.equals(id, id1);
    }

    @Override
    public String toString() {
        return "考号 = " + id + ", 姓名 = " + name + ", 总分 = " + total +
                ", 语文 = " + chinese + ", 数学 = " + math + ", 英语 = " + english +
                ", 物理 = " + physics + ", 化学 = " + chemistry + ", 生物 = " + biology;
    }
}
