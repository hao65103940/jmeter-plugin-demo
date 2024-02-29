package com.jmeter.plugin.utils.event;

import com.jmeter.plugin.utils.TraderUtilsByC;

public class EESTraderEventImpl implements TraderUtilsByC.TraderApi.EESTraderEvent {
    @Override
    public void OnConnection(int errNo, String pErrStr) {

        System.out.println(errNo+" "+pErrStr);
    }
}
