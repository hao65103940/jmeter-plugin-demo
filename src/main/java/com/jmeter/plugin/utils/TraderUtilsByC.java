package com.jmeter.plugin.utils;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/**
 * @author fit2cloudzhao
 * @date 2024/2/29 16:43
 * @description:
 */
public class TraderUtilsByC {

    public interface TraderApi extends Library {

        // 加载链接
        TraderApi TEST_SO = Native.load("D:\\IdeaProject\\jmeter-plugin-demo\\src\\main\\resources\\lib\\EESTraderApi.dll", TraderApi.class);
        // 交接接口链接
        int ConnServer(String traderServerIp, int traderServerPort, EESTraderEventCallback pEvent , String queryServerIp, int queryServerPort);
        // 定义事件回调接口
        interface EESTraderEventCallback  extends com.sun.jna.Callback {
            void callbackMethod(Pointer data); // 这里的callbackMethod和数据类型需要根据实际情况调整
        }
    }


    public static void main(String[] args) {
        System.setProperty("java.library.path", "resource/lib/");
        String traderServerIp="101.230.113.155";
        int traderServerPort=20000;
        String queryServerIp="101.230.113.155";
        int queryServerPort=20001;
        int result = TraderApi.TEST_SO.ConnServer(traderServerIp, traderServerPort, null,queryServerIp, queryServerPort);
        System.out.println(result);
    }



}
