/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jmeter.plugin.hangqing;

public class EqsLoginParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EqsLoginParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EqsLoginParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(EqsLoginParam obj) {
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
        shenglihangqingJNI.delete_EqsLoginParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EqsLoginParam() {
    this(shenglihangqingJNI.new_EqsLoginParam(), true);
  }

  public void setM_loginId(String value) {
    shenglihangqingJNI.EqsLoginParam_m_loginId_set(swigCPtr, this, value);
  }

  public String getM_loginId() {
    return shenglihangqingJNI.EqsLoginParam_m_loginId_get(swigCPtr, this);
  }

  public void setM_password(String value) {
    shenglihangqingJNI.EqsLoginParam_m_password_set(swigCPtr, this, value);
  }

  public String getM_password() {
    return shenglihangqingJNI.EqsLoginParam_m_password_get(swigCPtr, this);
  }

}
