package com.serene.iostreampractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/21
 */
public class Practice3 {
    public static void main(String[] args) throws IOException {
        /*
        排序文件中的数据并保存（使用FileInputStream）
        文本文件中有以下的数据：
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据：
        1-2-4-7-8-9
         */
        FileInputStream fIn = new FileInputStream("src/com/serene/iostreampractice/test/a.txt");
        int b;
        StringBuilder sb = new StringBuilder();
        while ((b = fIn.read()) != -1) {
            sb.append((char) b);
        }

        String[] arrStr = sb.toString().split("-");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String s : arrStr) {
            integerArrayList.add(Integer.parseInt(s));
        }

        Collections.sort(integerArrayList);

        FileOutputStream fOut = new FileOutputStream("src/com/serene/iostreampractice/test/b.txt");
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (i == 0) {
                fOut.write(integerArrayList.get(i) + 48);
                continue;
            }
            fOut.write((int) '-');
            fOut.write(integerArrayList.get(i) + 48);
        }

        fOut.close();
        fIn.close();
    }

}
