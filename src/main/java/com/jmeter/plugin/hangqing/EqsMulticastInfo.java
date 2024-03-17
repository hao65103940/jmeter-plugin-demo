/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jmeter.plugin.hangqing;

public class EqsMulticastInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EqsMulticastInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EqsMulticastInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(EqsMulticastInfo obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        shenglihangqingJNI.delete_EqsMulticastInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_mcIp(String value) {
    shenglihangqingJNI.EqsMulticastInfo_m_mcIp_set(swigCPtr, this, value);
  }

  public String getM_mcIp() {
    return shenglihangqingJNI.EqsMulticastInfo_m_mcIp_get(swigCPtr, this);
  }

  public void setM_mcPort(int value) {
    shenglihangqingJNI.EqsMulticastInfo_m_mcPort_set(swigCPtr, this, value);
  }

  public int getM_mcPort() {
    return shenglihangqingJNI.EqsMulticastInfo_m_mcPort_get(swigCPtr, this);
  }

  public void setM_mcLoacalIp(String value) {
    shenglihangqingJNI.EqsMulticastInfo_m_mcLoacalIp_set(swigCPtr, this, value);
  }

  public String getM_mcLoacalIp() {
    return shenglihangqingJNI.EqsMulticastInfo_m_mcLoacalIp_get(swigCPtr, this);
  }

  public void setM_mcLocalPort(int value) {
    shenglihangqingJNI.EqsMulticastInfo_m_mcLocalPort_set(swigCPtr, this, value);
  }

  public int getM_mcLocalPort() {
    return shenglihangqingJNI.EqsMulticastInfo_m_mcLocalPort_get(swigCPtr, this);
  }

  public void setM_exchangeId(String value) {
    shenglihangqingJNI.EqsMulticastInfo_m_exchangeId_set(swigCPtr, this, value);
  }

  public String getM_exchangeId() {
    return shenglihangqingJNI.EqsMulticastInfo_m_exchangeId_get(swigCPtr, this);
  }

  public EqsMulticastInfo() {
    this(shenglihangqingJNI.new_EqsMulticastInfo(), true);
  }

}
