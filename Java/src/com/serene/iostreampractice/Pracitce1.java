package com.serene.iostreampractice;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/20
 */
public class Pracitce1 {
    public static void main(String[] args) {

    }

    public static void copyDir(File src, File des) throws IOException {
        if (src.isFile()) {
            throw new RuntimeException("必须是文件夹！");
        }

        File[] files = src.listFiles();

        if (files == null) {
            throw new IOException("权限不足！");
        }

        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fIn = new FileInputStream(file);
                FileOutputStream fOut = new FileOutputStream(new File(des, file.getName()));

                int len;
                byte[] bytes = new byte[1024];
                while ((len = fIn.read(bytes)) != -1) {
                    fOut.write(bytes, 0, len);
                }

                fOut.close();
                fIn.close();
            } else {
                copyDir(file, new File(des, file.getName()));
            }

        }

    }

}
