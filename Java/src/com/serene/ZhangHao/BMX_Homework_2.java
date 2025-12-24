package com.serene.ZhangHao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/24
 */
public class BMX_Homework_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("./src/com/serene/ZhangHao/res"))) {
            while (true) {
                try {
                    Object obj = objIn.readObject();
                    if (obj instanceof Student) {
                        Student student = (Student) obj;
                        System.out.println(student);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
