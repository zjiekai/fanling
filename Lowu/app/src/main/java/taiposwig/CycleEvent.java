/* This Source Code Form is subject to the terms of the Mozilla Public
License, v. 2.0. If a copy of the MPL was not distributed with this
file, You can obtain one at https://mozilla.org/MPL/2.0/. */

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package taiposwig;

public final class CycleEvent {
  public final static CycleEvent Start = new CycleEvent("Start");
  public final static CycleEvent Pause = new CycleEvent("Pause");
  public final static CycleEvent Restore = new CycleEvent("Restore");
  public final static CycleEvent Stop = new CycleEvent("Stop");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CycleEvent swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CycleEvent.class + " with value " + swigValue);
  }

  private CycleEvent(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CycleEvent(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CycleEvent(String swigName, CycleEvent swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CycleEvent[] swigValues = { Start, Pause, Restore, Stop };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
