package com.serene.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/24
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File zipFile = new File("./src/com/serene/zipstream/test/vim-cpp-enhanced-highlight-master.zip");

        File destination = new File("./src/com/serene/zipstream/test/");

        unZip(zipFile, destination);

    }

    public static void unZip(File src, File des) throws IOException {
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;

        while ((entry = zipIn.getNextEntry()) != null) {
            File file = new File(des, entry.toString());
            if (entry.isDirectory()) {
                file.mkdirs();
            } else {
                BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream(file));
                byte[] bytes = new byte[1 << 10];
                int len;
                while ((len = zipIn.read(bytes)) != -1) {
                    bOut.write(bytes, 0, len);
                }
                zipIn.closeEntry();
                bOut.close();
            }
        }

        zipIn.close();
    }

}
