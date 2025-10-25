package com.serene.student;

/**
 * @author Serene Lee
 * @date 2025/10/18
 */
public class StudentTest {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息，如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“2”的学生，如果存在，则将他的年龄 +1岁
        */


        //1.创建一个长度为3的数组
        Student[] arr = new Student[3];

        //2.创建学生对象
        Student stu1 = new Student(1, "小明", 18);
        Student stu2 = new Student(2, "小红", 19);
        Student stu3 = new Student(3, "小兰", 20);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4.再次创建一个学生对象
        Student stu4 = new Student(4, "小智", 17);

        //5.唯一性判断
        boolean flag = checkOnly(arr, stu4.getId());
        if (flag) {
            //5.2不存在---添加学生对象
            //6.添加学生对象
            int count = getCount(arr);
            if (count == arr.length) {
                //6.1 老数组已经存满
                arr = createNewArray(arr, 1);
                int index = getFirstNullIndex(arr);
                arr[index] = stu4;

            } else {
                //6.2老数组没有存满
                int index = getFirstNullIndex(arr);
                arr[index] = stu4;
            }

        } else {
            //5.1已存在---提示重复
            System.out.println("已存在，添加失败。");
        }


        //7通过id删除学生信息，如果存在，则删除，如果不存在，则提示删除失败。
        //7.1存在---删除
        //7.2不存在---提示失败
        deleteStudent(arr, 1);

        //删除完毕之后，遍历所有学生信息。
        printStudents(arr);

        //查询数组id为“2”的学生，如果存在，则将他的年龄 +1岁
        for (Student stu : arr) {
            if (stu != null) {
                if (stu.getId() == 2) {
                    stu.setAge(stu.getAge() + 1);
                }
            }
        }


    }

    public static void deleteStudent(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    arr[i] = null;
                    return;
                }
            }
            System.out.println("id不存在，删除失败");
        }

    }

    public static void printStudents(Student[] arr) {
        for (Student stu : arr) {
            if (stu != null) {
                System.out.print("学号：");
                System.out.print(stu.getId());
                System.out.print(", 姓名：");
                System.out.print(stu.getName());
                System.out.print(", 年龄：");
                System.out.println(stu.getAge());
            }
        }

    }

    public static Student[] createNewArray(Student[] arr, int plusLength) {
        Student[] newArr = new Student[arr.length + plusLength];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getFirstNullIndex(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return -1;

    }

    public static boolean checkOnly(Student[] arr, int id) {
        for (Student stu : arr) {
            if (stu != null) {
                if (stu.getId() == id) {
                    return false;
                }
            }
        }
        return true;

    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (Student stu : arr) {
            if (stu != null) {
                count++;
            }
        }
        return count;


    }

}
