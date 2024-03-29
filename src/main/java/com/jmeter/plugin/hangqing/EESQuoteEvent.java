/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jmeter.plugin.hangqing;

public class EESQuoteEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EESQuoteEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EESQuoteEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(EESQuoteEvent obj) {
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
        shenglihangqingJNI.delete_EESQuoteEvent(swigCPtr);
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
    shenglihangqingJNI.EESQuoteEvent_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    shenglihangqingJNI.EESQuoteEvent_change_ownership(this, swigCPtr, true);
  }

  public void OnEqsConnected() {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnEqsConnected(swigCPtr, this); else shenglihangqingJNI.EESQuoteEvent_OnEqsConnectedSwigExplicitEESQuoteEvent(swigCPtr, this);
  }

  public void OnEqsDisconnected() {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnEqsDisconnected(swigCPtr, this); else shenglihangqingJNI.EESQuoteEvent_OnEqsDisconnectedSwigExplicitEESQuoteEvent(swigCPtr, this);
  }

  public void OnLoginResponse(boolean bSuccess, String pReason) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnLoginResponse(swigCPtr, this, bSuccess, pReason); else shenglihangqingJNI.EESQuoteEvent_OnLoginResponseSwigExplicitEESQuoteEvent(swigCPtr, this, bSuccess, pReason);
  }

  public void OnQuoteUpdated(EesEqsIntrumentType chInstrumentType, EESMarketDepthQuoteData pDepthQuoteData) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnQuoteUpdated(swigCPtr, this, chInstrumentType.swigValue(), EESMarketDepthQuoteData.getCPtr(pDepthQuoteData), pDepthQuoteData); else shenglihangqingJNI.EESQuoteEvent_OnQuoteUpdatedSwigExplicitEESQuoteEvent(swigCPtr, this, chInstrumentType.swigValue(), EESMarketDepthQuoteData.getCPtr(pDepthQuoteData), pDepthQuoteData);
  }

  public void OnWriteTextLog(EesEqsLogLevel nlevel, String pLogText, int nLogLen) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnWriteTextLog(swigCPtr, this, nlevel.swigValue(), pLogText, nLogLen); else shenglihangqingJNI.EESQuoteEvent_OnWriteTextLogSwigExplicitEESQuoteEvent(swigCPtr, this, nlevel.swigValue(), pLogText, nLogLen);
  }

  public void OnSymbolRegisterResponse(EesEqsIntrumentType chInstrumentType, String pSymbol, boolean bSuccess) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnSymbolRegisterResponse(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bSuccess); else shenglihangqingJNI.EESQuoteEvent_OnSymbolRegisterResponseSwigExplicitEESQuoteEvent(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bSuccess);
  }

  public void OnSymbolUnregisterResponse(EesEqsIntrumentType chInstrumentType, String pSymbol, boolean bSuccess) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnSymbolUnregisterResponse(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bSuccess); else shenglihangqingJNI.EESQuoteEvent_OnSymbolUnregisterResponseSwigExplicitEESQuoteEvent(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bSuccess);
  }

  public void OnSymbolListResponse(EesEqsIntrumentType chInstrumentType, String pSymbol, boolean bLast) {
    if (getClass() == EESQuoteEvent.class) shenglihangqingJNI.EESQuoteEvent_OnSymbolListResponse(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bLast); else shenglihangqingJNI.EESQuoteEvent_OnSymbolListResponseSwigExplicitEESQuoteEvent(swigCPtr, this, chInstrumentType.swigValue(), pSymbol, bLast);
  }

  public EESQuoteEvent() {
    this(shenglihangqingJNI.new_EESQuoteEvent(), true);
    shenglihangqingJNI.EESQuoteEvent_director_connect(this, swigCPtr, true, true);
  }

}
