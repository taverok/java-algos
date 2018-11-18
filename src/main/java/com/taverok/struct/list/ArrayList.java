package com.taverok.struct.list;

import java.util.List;

public class ArrayList {
    private static int DEFAULT_CAPACITY = 16;
    private Object[] arr;
    private int size;

    ArrayList() {
        arr = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object e){
        arr[++size] = e;
    }

    private void assureCapacity(){
        if(size == arr.length-1){
            Object[] tmp = new Object[size*2];
            if (size >= 0) {
                System.arraycopy(arr, 0, tmp, 0, size);
                arr = tmp;
            }

        }
    }
}
