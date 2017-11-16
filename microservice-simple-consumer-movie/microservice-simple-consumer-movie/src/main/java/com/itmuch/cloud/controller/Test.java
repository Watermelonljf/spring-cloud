package com.itmuch.cloud.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by ljianf on 2017/10/20.
 */
public class Test {
    public static void main(String[] args) {
        String srcStr = "D:\\src.txt";
        try {
            //1.建立File对象
        File file = new File(srcStr);
        //建立
        FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
