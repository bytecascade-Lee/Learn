package com.serene.bufferedstream;

import java.io.*;
import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Practice2 {
    public static void main(String[] args) throws IOException {
        /*
        修改文本顺序
        需求：把《出师表》的文章顺序进行恢复到一个新文件中。
         */

        /*// 先打乱《出师表》

        BufferedReader bRd = new BufferedReader(new FileReader("./src/com/serene/bufferedstream/test/出师表.txt"));

        ArrayList<String> arrayList = new ArrayList<>();
        String s;
        while ((s = bRd.readLine()) != null) {
            arrayList.add(s);
        }

        Collections.shuffle(arrayList);
        Collections.shuffle(arrayList);
        Collections.shuffle(arrayList);

        bRd.close();

        BufferedWriter bWrt = new BufferedWriter(new FileWriter("./src/com/serene/bufferedstream/test/出师表.txt"));
        for (String str : arrayList) {
            bWrt.write(str);
            bWrt.newLine();
        }

        bWrt.close();*/

        BufferedReader bRd = new BufferedReader(new FileReader("./src/com/serene/bufferedstream/test/出师表.txt"));
        BufferedWriter bWrt = new BufferedWriter(new FileWriter("./src/com/serene/bufferedstream/test/出师表sort.txt"));

        ArrayList<String> arrayList = new ArrayList<>();
        String str1;
        while ((str1 = bRd.readLine()) != null) {
            arrayList.add(str1);
        }

        // Collections.sort(arrayList,
        //     ((o1, o2) -> Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0])));
        arrayList.sort((Comparator.comparingInt(o -> Integer.parseInt(o.split("\\.")[0]))));

        for (String str2 : arrayList) {
            bWrt.write(str2.split("\\.")[1]);
            bWrt.newLine();
        }

        bWrt.close();
        bRd.close();
    }

}
