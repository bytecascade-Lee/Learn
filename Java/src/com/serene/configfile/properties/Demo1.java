package com.serene.configfile.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("aaa", "123");
        properties.put("bbb", "456");
        properties.put("ccc", "789");
        properties.put("ddd", "147");
        properties.put("eee", "258");
        properties.put("fff", "369");

        FileWriter fWrt = new FileWriter("./src/com/serene/configfile/test/a.properties");
        properties.store(fWrt, "test");
        fWrt.close();
    }

}
