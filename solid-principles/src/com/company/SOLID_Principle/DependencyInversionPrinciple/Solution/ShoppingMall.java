package com.company.SOLID_Principle.DependencyInversionPrinciple.Solution;

public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }


    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
}
