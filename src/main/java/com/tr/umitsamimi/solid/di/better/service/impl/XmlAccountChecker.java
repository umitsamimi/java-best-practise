package com.tr.umitsamimi.solid.di.better.service.impl;

import com.tr.umitsamimi.solid.di.better.service.IAccountChecker;

public class XmlAccountChecker implements IAccountChecker {

    @Override
    public boolean exists(Integer accountNumber){

        return false;
    }
}
