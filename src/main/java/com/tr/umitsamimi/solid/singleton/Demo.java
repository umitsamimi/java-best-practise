package com.tr.umitsamimi.solid.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo {


    static BasicSingleton readFromFile(String fileName) throws Exception {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        return (BasicSingleton) in.readObject();
    }

    static void saveToFile(BasicSingleton singleton, String fileName) throws Exception {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(singleton);
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String fileName = "singleton.bin";
        saveToFile(singleton, fileName);

        singleton.setValue(222);
        BasicSingleton singleton2 = readFromFile(fileName);
        System.out.println(singleton == singleton2);

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());

    }
}