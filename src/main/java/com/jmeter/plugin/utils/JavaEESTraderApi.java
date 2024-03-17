package com.jmeter.plugin.utils;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface JavaEESTraderApi extends Library {

    int  ConnServer(String traderServerIp, int traderServerPort, TraderUtilsByC.TraderApi.EESTraderEvent pEvent, String queryServerIp, int queryServerPort);
    Pointer CreateEESTraderApi();
}
