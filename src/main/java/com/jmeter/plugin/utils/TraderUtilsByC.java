package com.jmeter.plugin.utils;

import com.jmeter.plugin.domain.EESTradeSvrInfo;
import com.jmeter.plugin.utils.event.EESTraderEventImpl;
import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.File;
import java.net.URL;

/**
 * @author fit2cloudzhao
 * @date 2024/2/29 16:43
 * @description:
 */
public class TraderUtilsByC {
    /**
     * 加载本地库文件
     *
     * @return 返回TraderApi对象
     */
    static TraderApi loadNativeLibrary() {
        // 获取库文件名
        String fileName = "EESTraderApi";
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            fileName += ".dll";
        } else { // 假定非Windows为Linux或其他支持.so的系统
            fileName += ".so";
        }
        String libName = new TraderUtilsByC().getPath(fileName);
        // 若库文件在类路径中的相对路径"lib/"下，尝试从classloader加载
        // URL resourceUrl = NativeLibraryLoader.class.getResource("/" + libName);
        // if (resourceUrl != null) {
        //     return (TraderApi) Native.load(resourceUrl.getFile(), TraderApi.class);
        // }
        File libFile = new File(libName);
        if (!libFile.exists()) {
            throw new RuntimeException("Native library file not found: " + libName);
        }
        System.out.println(libFile.getAbsolutePath());
        return Native.load(libFile.getAbsolutePath(), TraderApi.class);
    }


    /**
     * 获取指定文件名的路径
     *
     * @param filename 文件名
     * @return 文件路径
     */
    String getPath(String filename) {
        URL resourceUrl = this.getClass().getClassLoader().getResource("lib/" + filename);
        return resourceUrl.getPath();
//        return this.getClass().getResource("").getPath() + filename;
//        return this.getClass().getClassLoader().getResource(filename).getPath();
    }


    public interface TraderApi extends Library {

        // 加载链接
//        TraderApi TEST_SO = Native.load("D:\\IdeaProject\\jmeter-plugin-demo\\src\\main\\resources\\lib\\EESTraderApi.dll", TraderApi.class);


        // 交接接口链接
        int ConnServer(String traderServerIp, int traderServerPort, EESTraderEvent pEvent, String queryServerIp, int queryServerPort);

        int ConnServer(EESTradeSvrInfo eesTradeSvrInfo, EESTraderEvent eventCallback);

        // 定义事件回调接口
        interface EESTraderEvent extends com.sun.jna.Callback {
            /**
             * 服务器连接事件
             *
             * @param errNo   连接成功能与否的消息
             * @param pErrStr 错误信息
             */
            void OnConnection(int errNo, String pErrStr);
        }
    }


    public static void main(String[] args) {
        String traderServerIp = "101.230.113.155";
        int traderServerPort = 20000;
        String queryServerIp = "101.230.113.155";
        int queryServerPort = 20001;

//
        EESTraderEventImpl eesTraderEvent = new EESTraderEventImpl();

        EESTradeSvrInfo eesTradeSvrInfo = new EESTradeSvrInfo();
        eesTradeSvrInfo.setLocalTradeIp(traderServerIp);
        eesTradeSvrInfo.setRemoteTradeIp(traderServerIp);
        eesTradeSvrInfo.setRemoteQueryIp(traderServerIp);
//
//        int result = TraderUtilsByC.loadNativeLibrary().ConnServer(traderServerIp, traderServerPort, null,queryServerIp, queryServerPort);
//        int results = TraderUtilsByC.loadNativeLibrary().ConnServer(eesTradeSvrInfo, eesTraderEvent);
//        System.out.println(result);
//        System.out.println(results);

        try {
            TraderApi load = Native.load("D:\\IdeaProject\\jmeter-plugin-demo\\target\\classes\\lib\\EESTraderApi.dll", TraderApi.class);
            load.ConnServer(eesTradeSvrInfo, eesTraderEvent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
