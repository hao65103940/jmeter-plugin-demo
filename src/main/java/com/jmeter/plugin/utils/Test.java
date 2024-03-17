package com.jmeter.plugin.utils;

import com.jmeter.plugin.utils.event.EESTraderEventImpl;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface Test extends Library {

    Test INSTANCE = (Test) Native.load("dll/EESTraderApi.dll", Test.class);

    Pointer CreateEESTraderApi();

    int ConnServer(String traderServerIp, int traderServerPort, TraderUtilsByC.TraderApi.EESTraderEvent pEvent, String queryServerIp, int queryServerPort) ;


    /**
     * /// 用户登录
     *
     * 	/// \brief	这里输入的不是帐户名，是用户名
     * 	/// \param  const char* userId			用户名
     * 	/// \param  const char* userPwd		    用户登录密码
     * 	/// \param  const char* app_id		    AppId
     * 	/// \param  const char* auth_code		授权码
     * 	/// \return RESULT			返回值，参考 EesTraderErr.h文件
     * @param userId
     * @param userPwd
     * @param appId
     * @param authCode
     * @return
     * virtual RESULT UserLogon(const char* user_id, const char* user_pwd, const char* app_id, const char* auth_code) = 0 ;
     */
    int UserLogon(String userId, String userPwd, String appId, String authCode);

    public static void main(String[] args) {
        System.setProperty("jna.library.path", "dll/EESTraderApi.dll");
        String traderServerIp = "101.230.113.155";
        int traderServerPort = 20000;
        String queryServerIp = "101.230.113.155";
        int queryServerPort = 20001;
        String bits = System.getProperty("sun.arch.data.model");
        System.out.println(bits);
        EESTraderEventImpl eesTraderEvent = new EESTraderEventImpl();
        EESTraderApiWrapper eesTraderApiWrapper = new EESTraderApiWrapper();

//        int i = INSTANCE.ConnServer(traderServerIp, traderServerPort, eesTraderEvent, queryServerIp, queryServerPort);
//        System.out.println(i);
//        String userId="00000059";
//        String userPwd = "123456";
//        String appId = "SKT";
//        String authCode = "123456";
//        int i1 = Test.INSTANCE.UserLogon(userId, userPwd, appId, authCode);
//
//
//        System.out.println(i1);

        int i = eesTraderApiWrapper.ConnServer(traderServerIp, traderServerPort, eesTraderEvent, queryServerIp, queryServerPort);

        System.out.println(i);


//        int i = test.ConnServer(traderServerIp, traderServerPort, eesTraderEvent, queryServerIp, queryServerPort);
//        System.out.println(i);

    }
}

