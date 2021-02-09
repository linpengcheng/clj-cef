package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefCookie extends Structure{




public CefStringUtf16 name;

public CefStringUtf16 value;

public CefStringUtf16 domain;

public CefStringUtf16 path;

public int secure;

public int httponly;

public CefTime creation;

public CefTime last_access;

public int has_expires;

public CefTime expires;

public int same_site;

public int priority;

protected List getFieldOrder() {
                                            return Arrays.asList("name", "value", "domain", "path", "secure", "httponly", "creation", "last_access", "has_expires", "expires", "same_site", "priority");
 }}