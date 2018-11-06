package com.instructure.canvas.invoker;

import java.util.Iterator;

/**
 * Something that supports Canvas paging.
 * @param <T> The underlying thing we're paging.
 */
public interface Paging<T>{

    boolean isFirst();
    boolean isLast();
    boolean hasNext();
    boolean hasPrev();

    String first();
    String last();
    String next();
    String prev();

}
