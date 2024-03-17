package com.jmeter.plugin.domain;

import com.sun.jna.Structure;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 */
public class EESTradeSvrInfo extends Structure {

    public byte[] m_remoteTradeIp = new byte[16]; // 服务器交易IP
    public short m_remoteTradeTCPPort; // 服务器交易TCP端口
    public short m_remoteTradeUDPPort; // 服务器交易UDP端口

    public byte[] m_remoteQueryIp = new byte[16]; // 服务器查询IP
    public short m_remoteQueryTCPPort; // 服务器查询TCP端口

    public byte[] m_LocalTradeIp = new byte[16]; // 本地交易IP
    public short m_LocalTradeUDPPort; // 本地交易UDP端口

    public boolean m_timestamp_switch; // 是否开启硬件时间戳测试功能
    public boolean m_block_recv_switch; // 是否开启阻塞接收数据
    public short m_req_cpu_id; // 上行绑核 填-1，不绑定
    public short m_rsp_cpu_id; // 下行绑核 填-1，不绑定

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "m_remoteTradeIp",
                "m_remoteTradeTCPPort",
                "m_remoteTradeUDPPort",
                "m_remoteQueryIp",
                "m_remoteQueryTCPPort",
                "m_LocalTradeIp",
                "m_LocalTradeUDPPort",
                "m_timestamp_switch",
                "m_block_recv_switch",
                "m_req_cpu_id",
                "m_rsp_cpu_id"
        );
    }

    public EESTradeSvrInfo() {
        super();
        m_req_cpu_id = -1;
        m_rsp_cpu_id = -1;
    }
}
