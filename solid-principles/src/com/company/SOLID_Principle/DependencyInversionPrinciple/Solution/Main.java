package com.company.SOLID_Principle.DependencyInversionPrinciple.Solution;

public class Main {

    public static void main(String[] args) {

    // shopping with card this makes the hides the type of card implementation
        BankCard creditCard = new CreditCard();
        ShoppingMall creditCardMall = new ShoppingMall(creditCard);
        creditCardMall.doPurchaseSomething(5000);


        BankCard debitCard = new DebitCard();
        ShoppingMall debitCardMall = new ShoppingMall(debitCard);
        debitCardMall.doPurchaseSomething(6000);

        BankCard masterCard = new MasterCard();
        ShoppingMall masterCardMall = new ShoppingMall(masterCard);
        masterCardMall.doPurchaseSomething(1000);
    }


}
