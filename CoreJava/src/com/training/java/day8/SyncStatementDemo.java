package com.training.java.day8;

import java.util.ArrayList;

public class SyncStatementDemo {
    private ArrayList<Object> objList = new ArrayList<Object> ();
    public void addObject(Object obj) {
        synchronized(objList) {
        	objList.add(obj);
        }
    }
    public void removeObj(Object obj) {
        synchronized(objList) {
        	objList.remove(obj);
        }
    }
}
