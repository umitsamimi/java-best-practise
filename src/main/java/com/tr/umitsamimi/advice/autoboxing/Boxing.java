package com.tr.umitsamimi.advice.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        // creating an Integer Object
        // with value 10.
        Integer i = new Integer(10);

        // unboxing the Object
        int i1 = i;

        List<Integer> list = new ArrayList<Integer>();
        for (int k = 0; k < 10; k++) {
            list.add(k); //AUTOBOXING
        }

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        //Autoboxing of char
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
    }
}
