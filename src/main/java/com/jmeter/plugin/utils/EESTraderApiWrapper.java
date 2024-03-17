package com.jmeter.plugin.utils;

import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;


public class EESTraderApiWrapper {


    private JavaEESTraderApi instance;

    private final Function method1Func;

    public EESTraderApiWrapper() {
        // 加载本地库
        instance = Native.load("dll/EESTraderApi.dll", JavaEESTraderApi.class, null);
        // 调用返回指针类型的 C++ 函数
        Pointer pointer = instance.CreateEESTraderApi();
        // 将 Pointer 对象转换为接口实例
        Pointer pointerObj = new Pointer(Pointer.nativeValue(pointer));

// 将指针转换为接口实例
//        instance= Native.load(pointerObj, JavaEESTraderApi.class);
        // 将指针转换为接口代理类
//        instance = JavaEESTraderApi.class.cast(pointerObj);

         method1Func = Function.getFunction(String.valueOf(pointer), "ConnServer");
    }


    // 实现接口方法
    public int ConnServer(String traderServerIp, int traderServerPort, TraderUtilsByC.TraderApi.EESTraderEvent pEvent, String queryServerIp, int queryServerPort) {
     return  method1Func.invokeInt(new String[]{traderServerIp, String.valueOf(traderServerPort), pEvent.toString(), queryServerIp, String.valueOf(queryServerPort)});

    }

}
