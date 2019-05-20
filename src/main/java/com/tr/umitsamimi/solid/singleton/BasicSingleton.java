package com.tr.umitsamimi.solid.singleton;

import java.io.*;

public class BasicSingleton implements Serializable {
    private BasicSingleton(){}
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value = 0;

    public static BasicSingleton getInstance(){
        return  INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /* TODO OPEN HERE TO GET SAME INSTANCE
    protected Object readResolve(){
        return INSTANCE;
    }*/
}


