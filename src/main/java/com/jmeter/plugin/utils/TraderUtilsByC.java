package com.jmeter.plugin.utils;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author fit2cloudzhao
 * @date 2024/2/29 16:43
 * @description:
 */
public class TraderUtilsByC {

    public interface TraderApi extends Library {

        // 加载链接
        TraderApi TEST_SO = Native.load("/Users/fit2cloudzhao/Documents/MS/jmeter-plugin-demo/src/main/resources/lib/libEESTraderApi.so", TraderApi.class);
        // 交接接口链接
        int connServer(String traderServerIp, int traderServerPort, String queryServerIp, int queryServerPort);

    }


    public static void main(String[] args) {
        System.setProperty("java.library.path", "resource/lib/");
        String traderServerIp="101.230.113.155";
        int traderServerPort=20000;
        String queryServerIp="101.230.113.155";
        int queryServerPort=20001;
        int result = TraderApi.TEST_SO.connServer(traderServerIp, traderServerPort, queryServerIp, queryServerPort);
        System.out.println(result);
    }



}
