package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefRange extends Structure{




public int from;

public int to;

protected List getFieldOrder() {
                                            return Arrays.asList("from", "to");
 }}