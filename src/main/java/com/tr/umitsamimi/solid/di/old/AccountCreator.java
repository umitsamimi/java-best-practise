package com.tr.umitsamimi.solid.di.old;

public class AccountCreator {

  private AccountChecker accountChecker;
  private AccountRepository accountRepository;
  
  public AccountCreator(){
    accountChecker = new AccountChecker();
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