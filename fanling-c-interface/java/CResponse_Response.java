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


public class CResponse_Response {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CResponse_Response(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CResponse_Response obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        rust_test_cJNI.delete_CResponse_Response(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOk(boolean value) {
    rust_test_cJNI.CResponse_Response_ok_set(swigCPtr, this, value);
  }

  public boolean getOk() {
    return rust_test_cJNI.CResponse_Response_ok_get(swigCPtr, this);
  }

  public void setResponse(SWIGTYPE_p_Response value) {
    rust_test_cJNI.CResponse_Response_response_set(swigCPtr, this, SWIGTYPE_p_Response.getCPtr(value));
  }

  public SWIGTYPE_p_Response getResponse() {
    return new SWIGTYPE_p_Response(rust_test_cJNI.CResponse_Response_response_get(swigCPtr, this), true);
  }

  public void setError(SWIGTYPE_p_String value) {
    rust_test_cJNI.CResponse_Response_error_set(swigCPtr, this, SWIGTYPE_p_String.getCPtr(value));
  }

  public SWIGTYPE_p_String getError() {
    return new SWIGTYPE_p_String(rust_test_cJNI.CResponse_Response_error_get(swigCPtr, this), true);
  }

  public CResponse_Response() {
    this(rust_test_cJNI.new_CResponse_Response(), true);
  }

}
