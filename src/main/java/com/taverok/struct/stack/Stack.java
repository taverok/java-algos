package com.taverok.struct.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private final static int DEFAULT_CAPACITY = 16;

    private Object[] items;
    private int tos = 0;

    Stack(){
        items = new Object[DEFAULT_CAPACITY];
    }

    public Object pop(){
        if (tos < 1)
            throw new EmptyStackException();
        Object result = items[--tos];
        items[tos] = null;
        return result;
    }

    public void push(Object item){
        ensureCapacity();
        items[tos++] = item;
    }

    private void ensureCapacity(){
        if (items.length == tos + 1){
            items = Arrays.copyOf(items, items.length * 2);
        }
    }
}
