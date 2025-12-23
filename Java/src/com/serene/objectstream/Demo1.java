package com.serene.objectstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Student student = new Student("王逸雯", 18);

        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("./src/com/serene/objectstream/test/王逸雯.txt"));

        objOut.writeObject(student);

        objOut.close();*/

        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("./src/com/serene/objectstream/test/王逸雯.txt"));

        Object o = objIn.readObject();
        System.out.println(o);

        objIn.close();
    }

}
