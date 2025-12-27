package com.serene.configfile.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fRd = new FileReader("./src/com/serene/configfile/test/a.properties");
        Properties properties = new Properties();
        properties.load(fRd);
        fRd.close();

        properties.entrySet().forEach(System.out::println);
    }

}
