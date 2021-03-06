// AUTO GENERATED BY gen2.clj!

package com.phronemophobic.cljcef;

import com.phronemophobic.cljcef.*;

import com.sun.jna.Structure;

import com.sun.jna.Callback;

import com.sun.jna.Pointer;

import java.util.List;

import java.util.Arrays;

public class CefStreamWriter extends Structure{
public CefStreamWriter(){
base.size.setValue(this.size());

ReferenceCountImpl.track(this.getPointer());

}

public static interface WriteFunc extends Callback {

SizeT write(CefStreamWriter x0, Pointer x1, SizeT x2, SizeT x3); 
}

public static interface SeekFunc extends Callback {

int seek(CefStreamWriter x0, long x1, int x2); 
}

public static interface TellFunc extends Callback {

long tell(CefStreamWriter x0); 
}

public static interface FlushFunc extends Callback {

int flush(CefStreamWriter x0); 
}

public static interface MayBlockFunc extends Callback {

int may_block(CefStreamWriter x0); 
}

public CefBaseRefCounted base;

public WriteFunc write;

public SeekFunc seek;

public TellFunc tell;

public FlushFunc flush;

public MayBlockFunc may_block;

protected List getFieldOrder() {
                                            return Arrays.asList("base", "write", "seek", "tell", "flush", "may_block");
 }

public SizeT write (Pointer x1, SizeT x2, SizeT x3) {

return  this.write.write(this,  x1,  x2,  x3);

}

public int seek (long x1, int x2) {

return  this.seek.seek(this,  x1,  x2);

}

public long tell () {

return  this.tell.tell(this);

}

public int flush () {

return  this.flush.flush(this);

}

public int mayBlock () {

return  this.may_block.may_block(this);

}}