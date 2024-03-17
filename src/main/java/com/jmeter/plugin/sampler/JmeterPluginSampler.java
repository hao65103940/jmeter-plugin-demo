package com.jmeter.plugin.sampler;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.testelement.TestStateListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fit2cloudzhao
 * @date 2024/2/26 15:51
 * @description:
 */
public class JmeterPluginSampler extends AbstractSampler implements TestStateListener {
    Logger log = LoggerFactory.getLogger(JmeterPluginSampler.class);

    private static final String SERVER_IP = "server_ip";
    private static final String PORT = "port";

    private static final String PARAM = "request_param";



    public JmeterPluginSampler() {
        setName("Jmeter plugin sampler");
    }

    @Override
    public SampleResult sample(Entry entry) {

        SampleResult sampleResult = new SampleResult();
        // 开始统计响应时间标记
        sampleResult.sampleStart();
        try {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            String param = getParam();
            String response = "";
            System.out.println("输入IP地址："+getServerIp());
            System.out.println("输入端口："+getPort());
            System.out.println("输入参数："+getParam());
            log.info("输入IP地址：" + getServerIp());
            log.info("输入端口：" + getPort());
            log.info("输入参数：" + getParam());
                /**
                 * 需要写自己的业务逻辑
                 */
//            thriftClient = getThriftClient();
            if (StringUtils.isNotBlank(param)) {
//                response = thriftClient.getResponse(param);
                response=getParam();
                System.out.println("参数不为空："+getParam());
            } else {
//                response = thriftClient.getResponse("我是空的");
                System.out.println("参数为空!!!");
                response="";
            }
            System.out.println("response==>" + response);
            log.info("response==>" + response);
            stopWatch.stop();
            System.out.println(response + "总计花费:" + stopWatch.getTime());
            log.info(response + "总计花费:" + stopWatch.getTime());
            if (StringUtils.isNotBlank(response)) {
                sampleResult.setSuccessful(true);
                sampleResult.setResponseMessage(response);
                sampleResult.setResponseData(("请求成功:"+response).getBytes());
                sampleResult.setResponseCode("200");
            } else {
                sampleResult.setSuccessful(false);
                sampleResult.setResponseMessage("请求失败....请求参数：" + param);
                sampleResult.setResponseCode("500");
                sampleResult.setResponseData("请求失败".getBytes());
            }
        } catch (Exception e) {
            sampleResult.setSuccessful(false);
            sampleResult.setResponseMessage("请求失败...." + e.getMessage());
            sampleResult.setResponseCode("500");
            sampleResult.setResponseData(("请求失败...." + e.getMessage()).getBytes());
        } finally {
            // 结束统计响应时间标记
            sampleResult.sampleEnd();
        }
        return sampleResult;
    }

    @Override
    public void testStarted() {

    }

    @Override
    public void testStarted(String s) {

    }

    @Override
    public void testEnded() {
        this.testEnded("local");
    }

    @Override
    public void testEnded(String s) {
    }


    public String getServerIp() {
        return getPropertyAsString(SERVER_IP);
    }
    public void setServerIp(String serverIp) {
        setProperty(SERVER_IP, serverIp);
    }

    public Integer getPort() {
        return getPropertyAsInt(PORT);
    }

    public void setPort(Integer port) {
        setProperty(PORT, port);
    }

    public void setParam(String param) {
        setProperty(PARAM, param);
    }

    public String getParam() {
        return getPropertyAsString(PARAM);
    }

}
