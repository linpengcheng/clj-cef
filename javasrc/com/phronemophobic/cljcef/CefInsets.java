package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefInsets extends Structure{




public int top;

public int left;

public int bottom;

public int right;

protected List getFieldOrder() {
                                            return Arrays.asList("top", "left", "bottom", "right");
 }}