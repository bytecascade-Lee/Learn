package com.serene.iostreampractice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/21
 */
public class Practice4 {
    public static void main(String[] args) throws IOException {
        /*
        排序文件中的数据并保存（使用FileReader）
        文本文件中有以下的数据：
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据：
        1-2-4-7-8-9
         */
        FileReader fIn = new FileReader("src/com/serene/iostreampractice/test/a.txt");
        int b;
        StringBuilder sb = new StringBuilder();
        while ((b = fIn.read()) != -1) {
            sb.append((char) b);
        }

        List<Integer> integerList = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt).
                sorted()
                .collect(Collectors.toList());

        FileWriter fOut = new FileWriter("src/com/serene/iostreampractice/test/b.txt");

        String s = integerList.toString().replace(",", "-");
        String res = s.substring(1);

        fOut.write(res);

        fOut.close();
        fIn.close();

    }

}
