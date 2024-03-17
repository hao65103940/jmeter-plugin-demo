/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.jmeter.plugin.hangqing;

public final class EesEqsIntrumentType {
  public final static EesEqsIntrumentType EQS_INVALID_TYPE = new EesEqsIntrumentType("EQS_INVALID_TYPE", shenglihangqingJNI.EQS_INVALID_TYPE_get());
  public final static EesEqsIntrumentType EQS_SH_STOCK = new EesEqsIntrumentType("EQS_SH_STOCK");
  public final static EesEqsIntrumentType EQS_SZ_STOCK = new EesEqsIntrumentType("EQS_SZ_STOCK");
  public final static EesEqsIntrumentType EQS_STOCK_OPTION = new EesEqsIntrumentType("EQS_STOCK_OPTION");
  public final static EesEqsIntrumentType EQS_FUTURE_OPTION = new EesEqsIntrumentType("EQS_FUTURE_OPTION");
  public final static EesEqsIntrumentType EQS_INDEX_OPTION = new EesEqsIntrumentType("EQS_INDEX_OPTION");
  public final static EesEqsIntrumentType EQS_FUTURE = new EesEqsIntrumentType("EQS_FUTURE");
  public final static EesEqsIntrumentType EQS_SGE = new EesEqsIntrumentType("EQS_SGE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EesEqsIntrumentType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EesEqsIntrumentType.class + " with value " + swigValue);
  }

  private EesEqsIntrumentType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EesEqsIntrumentType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EesEqsIntrumentType(String swigName, EesEqsIntrumentType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EesEqsIntrumentType[] swigValues = { EQS_INVALID_TYPE, EQS_SH_STOCK, EQS_SZ_STOCK, EQS_STOCK_OPTION, EQS_FUTURE_OPTION, EQS_INDEX_OPTION, EQS_FUTURE, EQS_SGE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
