package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefPoint extends Structure{




public int x;

public int y;

protected List getFieldOrder() {
                                            return Arrays.asList("x", "y");
 }}