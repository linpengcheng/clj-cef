package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefRegistration extends Structure{
public CefRegistration(){
base.size.setValue(this.size());
}



public CefBaseRefCounted base;

protected List getFieldOrder() {
                                            return Arrays.asList("base");
 }}