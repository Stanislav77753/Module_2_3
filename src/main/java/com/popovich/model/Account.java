package com.popovich.model;

public class Account {
    private Long id;
    private String accountData;

    /**
     * Default Constructor
     */
    public Account(){
    }

    /**
     * Plain constructor
     */
    public Account(String accountData){
        this.accountData = accountData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountData() {
        return accountData;
    }

    public void setAccountData(String accountData) {
        this.accountData = accountData;
    }
}
