/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jmeter.plugin.hangqing;

public class EESQuoteApi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EESQuoteApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EESQuoteApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(EESQuoteApi obj) {
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
        shenglihangqingJNI.delete_EESQuoteApi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    shenglihangqingJNI.EESQuoteApi_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    shenglihangqingJNI.EESQuoteApi_change_ownership(this, swigCPtr, true);
  }

  public boolean ConnServer(SWIGTYPE_p_std__vectorT_EqsTcpInfo_t vecEti, EESQuoteEvent pQuoteEventHandler) {
    return shenglihangqingJNI.EESQuoteApi_ConnServer__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__vectorT_EqsTcpInfo_t.getCPtr(vecEti), EESQuoteEvent.getCPtr(pQuoteEventHandler), pQuoteEventHandler);
  }

  public boolean ConnServer(EqsTcpInfo svrInfo, EESQuoteEvent pQuoteEventHandler) {
    return shenglihangqingJNI.EESQuoteApi_ConnServer__SWIG_1(swigCPtr, this, EqsTcpInfo.getCPtr(svrInfo), svrInfo, EESQuoteEvent.getCPtr(pQuoteEventHandler), pQuoteEventHandler);
  }

  public boolean InitMulticast(SWIGTYPE_p_std__vectorT_EqsMulticastInfo_t vecEmi, EESQuoteEvent pQuoteEventHandler) {
    return shenglihangqingJNI.EESQuoteApi_InitMulticast(swigCPtr, this, SWIGTYPE_p_std__vectorT_EqsMulticastInfo_t.getCPtr(vecEmi), EESQuoteEvent.getCPtr(pQuoteEventHandler), pQuoteEventHandler);
  }

  public void LoginToEqs(EqsLoginParam loginParam) {
    shenglihangqingJNI.EESQuoteApi_LoginToEqs(swigCPtr, this, EqsLoginParam.getCPtr(loginParam), loginParam);
  }

  public void QuerySymbolList() {
    shenglihangqingJNI.EESQuoteApi_QuerySymbolList(swigCPtr, this);
  }

  public void RegisterSymbol(EesEqsIntrumentType chInstrumentType, String pSymbol) {
    shenglihangqingJNI.EESQuoteApi_RegisterSymbol(swigCPtr, this, chInstrumentType.swigValue(), pSymbol);
  }

  public void UnregisterSymbol(EesEqsIntrumentType chInstrumentType, String pSymbol) {
    shenglihangqingJNI.EESQuoteApi_UnregisterSymbol(swigCPtr, this, chInstrumentType.swigValue(), pSymbol);
  }

  public void DisConnServer() {
    shenglihangqingJNI.EESQuoteApi_DisConnServer(swigCPtr, this);
  }

  public EESQuoteApi() {
    this(shenglihangqingJNI.new_EESQuoteApi(), true);
    shenglihangqingJNI.EESQuoteApi_director_connect(this, swigCPtr, true, true);
  }

}