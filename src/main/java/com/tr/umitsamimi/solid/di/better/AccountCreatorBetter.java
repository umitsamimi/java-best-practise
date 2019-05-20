package com.tr.umitsamimi.solid.di.better;

import com.tr.umitsamimi.solid.di.better.service.IAccountChecker;
import com.tr.umitsamimi.solid.di.old.AccountInfo;
import com.tr.umitsamimi.solid.di.old.AccountRepository;

public class AccountCreatorBetter {

    private IAccountChecker accountChecker;
    private AccountRepository accountRepository;

    public AccountCreatorBetter(IAccountChecker accountChecker){
        this.accountChecker = accountChecker;
        accountRepository = new AccountRepository();
    }

    public boolean TryCreateAccount(AccountInfo accountInfo){
        if(!accountChecker.exists(accountInfo.getAccountNumber())){
            accountRepository.createAccount(accountInfo);
            return true;
        }
        return false;
    }
}
