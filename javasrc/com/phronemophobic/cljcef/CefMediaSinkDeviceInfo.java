package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefMediaSinkDeviceInfo extends Structure{




public CefStringUtf16 ip_address;

public int port;

public CefStringUtf16 model_name;

protected List getFieldOrder() {
                                            return Arrays.asList("ip_address", "port", "model_name");
 }}