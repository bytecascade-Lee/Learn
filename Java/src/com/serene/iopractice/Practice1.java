package com.serene.iopractice;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/25
 */
public class Practice1 {
    public static void main(String[] args) throws IOException {
        /*
        制造假数据：
        获取姓氏:https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kge
        获取男生名字：https://www.haoming8.cn/baobao/10881.html
        获取女生名字：https://www.haoming8.cn/baobao/7641.html
         */

        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kge";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameString = webCrawler(familyNameNet);
        String boyNameString = webCrawler(boyNameNet);
        String girlNameString = webCrawler(girlNameNet);

        ArrayList<String> familyNameTemp = getData(familyNameString, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);
        ArrayList<String> boyNameTemp = getData(boyNameString, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTemp = getData(girlNameString, "(.. ){4}..", 0);

        // 处理姓
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTemp.subList(0, 16)) {
            for (int i = 0; i < s.length(); i++) {
                familyNameList.add(s.charAt(i) + "");
            }
        }

        // 处理男生名字
        ArrayList<String> boyNameList = new ArrayList<>();
        boyNameList.addAll(boyNameTemp.subList(6, boyNameTemp.size() - 27));

        // 处理女生名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTemp) {
            girlNameList.addAll(Arrays.asList(s.split(" ")));
        }

        // 随机生成100个男生姓名
        ArrayList<String> boy = generateNameList(familyNameList, boyNameList, 100, true);
        // 随机生成100个女生姓名
        ArrayList<String> girl = generateNameList(familyNameList, girlNameList, 100, false);

        File file = new File("./src/com/serene/iopractice/test/names.txt");
        writeNameList(file, boy);
        writeNameList(file, girl);

    }

    public static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();

        URL url = new URL(net);
        URLConnection urlConnection = url.openConnection();

        InputStreamReader cInRd = new InputStreamReader(urlConnection.getInputStream());

        char[] chars = new char[1 << 10];
        int len;
        while ((len = cInRd.read(chars)) != -1) {
            sb.append(chars, 0, len);
        }

        cInRd.close();

        return sb.toString();
    }

    public static ArrayList<String> getData(String rawString, String regex, int index) {
        ArrayList<String> arrayList = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rawString);
        while (matcher.find()) {
            arrayList.add(matcher.group(index));
        }

        return arrayList;
    }

    public static ArrayList<String> generateNameList(ArrayList<String> familyNameList, ArrayList<String> givenNameList, int count, boolean gender) {
        HashSet<String> nameSet = new HashSet<>();
        Random r = new Random();

        String gd = gender ? "男" : "女";

        int len1 = familyNameList.size();
        int len2 = givenNameList.size();

        while (nameSet.size() < count) {
            int m = r.nextInt(len1);
            int n = r.nextInt(len2);
            int age = r.nextInt(12, 30);
            nameSet.add(familyNameList.get(m) + givenNameList.get(n) + "-" + gd + "-" + age);
        }

        return new ArrayList<>(nameSet);
    }

    public static void writeNameList(File file, ArrayList<String> nameList) throws IOException {
        FileUtil.appendLines(nameList, file, StandardCharsets.UTF_8);
    }

}
