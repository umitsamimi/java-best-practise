package com.tr.umitsamimi.advice.variable;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger(4,100, new Random());
        BigInteger b2 = BigInteger.probablePrime(4, new Random());


        Boolean boolValue  = new Boolean(true); // Her defeasinda yeni bir obje yaratir
        Boolean boolValueAdviced = Boolean.valueOf(true); // Var olan boolean değerini döner

        String s1 = new String("Road Runner");
        String s2 = "Road Runner";
        s1 = s1.intern(); // s1 in havuzdaki degerine bakar

        if(s1 == s2)
            System.out.println("equals");
        else
            System.out.println("not equals");

    }
}
