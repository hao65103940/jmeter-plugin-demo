package com.jmeter.plugin.domain;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @author admin
 */
public class EESTradeSvrInfo {

    // 使用String类型存储IP地址
    private String mRemoteTradeIp;
    private String mRemoteQueryIp;
    private String mLocalTradeIp;

    // 使用short类型存储端口号
    private short mRemoteTradeTCPPort;
    private short mRemoteTradeUDPPort;
    private short mRemoteQueryTCPPort;
    private short mLocalTradeUDPPort;


    public EESTradeSvrInfo() {
        // Java中不需要手动初始化对象，但你可以选择设置默认值为0
        this.mRemoteTradeIp = "";
        this.mRemoteQueryIp = "";
        this.mLocalTradeIp = "";

        this.mRemoteTradeTCPPort = 0;
        this.mRemoteTradeUDPPort = 0;
        this.mRemoteQueryTCPPort = 0;
        this.mLocalTradeUDPPort = 0;
    }

    // 如果需要将IP字符串转换为InetAddress对象，可以添加以下方法
    public void setRemoteTradeIp(String ipStr)  {
//        if (ipStr != null && !ipStr.isEmpty()) {
//            byte[] bytes = Inet4Address.getByName(ipStr).getAddress();
//            StringBuilder sb = new StringBuilder();
//            for (byte b : bytes) {
//                sb.setLength(sb.length() - 1); // 移除最后一个多余的 '.'
//            }
//            this.mRemoteTradeIp = sb.toString();
//        }
        this.mRemoteTradeIp=ipStr;
    }

    public void setRemoteQueryIp(String ipStr) {
//        if (ipStr != null && !ipStr.isEmpty()) {
//            byte[] bytes = Inet4Address.getByName(ipStr).getAddress();
//            StringBuilder sb = new StringBuilder();
//            for (byte b : bytes) {
//                sb.append((b & 0xFF) + ".");
//            }
//            sb.setLength(sb.length() - 1);
//            this.mRemoteQueryIp = sb.toString();
//        }
        this.mRemoteQueryIp=ipStr ;

    }
    public void setLocalTradeIp(String ipStr) {
//        if (ipStr != null && !ipStr.isEmpty()) {
//            byte[] bytes = Inet4Address.getByName(ipStr).getAddress();
//            StringBuilder sb = new StringBuilder();
//            for (byte b : bytes) {
//                sb.append((b & 0xFF) + ".");
//            }
//            sb.setLength(sb.length() - 1);
//            this.mLocalTradeIp = sb.toString();
//        }
      this.mLocalTradeIp=ipStr;

    }
    // Getter方法
    public String getRemoteTradeIp() {
        return mRemoteTradeIp;
    }

    public short getRemoteTradeTCPPort() {
        return mRemoteTradeTCPPort;
    }

    public short getRemoteTradeUDPPort() {
        return mRemoteTradeUDPPort;
    }

    public String getRemoteQueryIp() {
        return mRemoteQueryIp;
    }

    public short getRemoteQueryTCPPort() {
        return mRemoteQueryTCPPort;
    }

    public String getLocalTradeIp() {
        return mLocalTradeIp;
    }

    public short getLocalTradeUDPPort() {
        return mLocalTradeUDPPort;
    }
}
