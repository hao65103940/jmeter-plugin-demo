package com.jmeter.plugin;

import java.io.File;

/**
 * @author fit2cloudzhao
 * @date 2024/2/26 15:50
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {


        String filePath = System.getProperty("user.dir") + File.separator + "dll"+ File.separator + "EESTraderApi.dll";


        System.out.println(filePath);
    }
}
